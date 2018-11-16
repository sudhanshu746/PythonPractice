#!/bin/bash -xv
# check enviorment


function exit_if_error {
if [[ $? -ne 0 ]];then
exit 1;
fi
}


echo "Checking Enviorment ..."
python -c 'import sys; v = sys.version_info; print("The CLI does not support Python versions less than 2.7.") and False if v < (2, 7) else True'
exit_if_error

python -c 'import sys; print("This script does not support the Python Anaconda environment. ") and False if "conda" in sys.version else True'
exit_if_error


# Parameter Intialization #
usage() { echo "Usage: $0 [-u <username>] [-p <password>] [-g <Resource Group>] [-m <MGMNT Nodes (Default: 3)>] [-d <DATA Nodes (Default: 4)>]  [-v <vm_type management Node (Default:  Standard_DS14_v2 )>] [-t <vm_type DataNodes Nodes (Default:  Standard_DS14_v2 )>] [-s <External Data Disks Size in GB (Default:  50) >] [-r <Azure Components Region (Default:  eastus2)> [-k <SKU Type> (Default:  Premium_LRS)]" 1>&2; exit 1; }

while getopts u:p:g:m:d:v:t:s:r:k:e:f:h: option
do
 case "${option}"
 in
 u) USER=${OPTARG};;
 p) PASSWORD=${OPTARG};;
 g) RG=${OPTARG};;
 m) MGMNT=${OPTARG};;
 d) DATA=${OPTARG};;
 v) MGMNT_VM_TYPE=${OPTARG};;
 t) DATA_VM_TYPE=${OPTARG};;
 s) DATA_DISK_SIZE=${OPTARG};;
 r) REGION=${OPTARG};;
 k) SKU_TYPE=${OPTARG};;
 e) MN_DATA_DISK_COUNT=${OPTARG};;
 f) DN_DATA_DISK_COUNT=${OPTARG};;
 h) usage ;;
 *) usage ;;
 esac
done

if test "$#" -lt 3; then
echo "Illegal number of parameters ..."
usage
elif [ -z "$USER" ] && [ -z "$PASSWORD" ] && [ -z "$RG" ];then
echo "Illegal number of parameters ..."
usage
fi
# Intialization #
ansible_rg_name="demo"
ansible_vnet_name="ansible09-27-17VNET"
CONF_PATH=${SCRIPT_PATH}/azure/conf
rg_name=${RG}
if [ -z "$REGION" ];then region="eastus2"; else  region=${REGION}; fi
addressPrefix_default='10.0.0.0/16'
subnetPrefix='10.0.0.0/24' # Default
ipa_static_ip='10.0.0.4' # Default
if [ -z "$MGMNT" ];then number_of_mgmnt_node=3; else  number_of_mgmnt_node=${MGMNT}; fi
if [ -z "$DATA" ];then number_of_data_node=4; else  number_of_data_node=${DATA}; fi
if [ -z "$MGMNT_VM_TYPE" ];then mgmnt_vm_type="Standard_DS14_v2"; else  mgmnt_vm_type=$MGMNT_VM_TYPE; fi
if [ -z "$DATA_VM_TYPE" ];then data_vm_type="Standard_DS14_v2"; else  data_vm_type=$DATA_VM_TYPE; fi
ipa_os_size="Standard_DS2_v2"
admin_username=${USER}
admin_password=${PASSWORD}
os_image="RedHat:RHEL:6.8:latest"
ipa_os_image="RedHat:RHEL:7.2:latest"
nsg_name=${rg_name}_NSG
nsg_rule="SSH"
vnet_name="${rg_name}_VNET"
subnet_name="${rg_name}_SUBNET"
availset_master="${rg_name}_availset_master"
availset_worker="${rg_name}_availset_worker"
fault_domain_master_count=3
fault_domain_worker_count=3
update_domain_master_count=4
update_domain_worker_count=4
if [ -z "$SKU_TYPE" ];then sku_type="Premium_LRS"; else  sku_type=${SKU_TYPE}; fi
os_disk_name="${rg_name,,}-ondisk"
if [ -z "$MN_DATA_DISK_COUNT" ];then mn_data_disk_count=3; else  mn_data_disk_count=${MN_DATA_DISK_COUNT} ; fi
if [ -z "$DN_DATA_DISK_COUNT" ];then dn_data_disk_count=2; else  dn_data_disk_count=${DN_DATA_DISK_COUNT} ; fi
if [ -z "$DATA_DISK_SIZE" ];then data_disk_size_gb=50; else  data_disk_size_gb=${DATA_DISK_SIZE} ; fi

#public_ip_name="${rg_name}_PublicIP"



incr=0
address_space_exist=$(/root/bin/az network vnet list --query "[?contains(addressSpace.addressPrefixes,'${addressPrefix_default}')]")

while [[ $address_space_exist != "" ]];do
incr=$(expr $incr + 1)
addressPrefix='10.'${incr}'.0.0/16'
subnetPrefix='10.'${incr}'.0.0/24'
ipa_static_ip='10.'${incr}'.0.4'
address_space_exist=$(/root/bin/az network vnet list --query "[?contains(addressSpace.addressPrefixes,'${addressPrefix}')]")
done



## Execution ##
# Create Resource Group
/root/bin/az group create --name $rg_name --location $region
exit_if_error

# Create Availability Sets
/root/bin/az vm availability-set create \
        --resource-group $rg_name \
    --name ${availset_master} \
        --location  $region \
        --platform-fault-domain-count $fault_domain_master_count \
        --platform-update-domain-count $update_domain_master_count \
        --unmanaged
exit_if_error

/root/bin/az vm availability-set create \
        --resource-group $rg_name \
    --name ${availset_worker} \
        --location  $region \
        --platform-fault-domain-count $fault_domain_worker_count \
        --platform-update-domain-count $update_domain_worker_count \
        --unmanaged
exit_if_error


/root/bin/az network nsg create \
        --resource-group $rg_name \
        --name $nsg_name
exit_if_error

/root/bin/az network nsg rule create \
--resource-group $rg_name \
--nsg-name $nsg_name \
--name default_allow_ssh \
--priority 1000 \
--source-address-prefixes "*" \
--source-port-ranges "*" \
--destination-port-ranges 22  \
--access Allow \
--protocol Tcp \
--description "allow ssh"
exit_if_error

/root/bin/az network vnet create \
        --resource-group $rg_name \
        --name $vnet_name \
        --address-prefix $addressPrefix \
        --location $region
exit_if_error

/root/bin/az network vnet subnet create \
        --resource-group $rg_name \
        --name $subnet_name \
        --vnet-name $vnet_name \
        --address-prefix $subnetPrefix \
        --network-security-group $nsg_name
exit_if_error

#/root/bin/az network public-ip create \
#       --name $public_ip_name \
#       --resource-group $rg_name \
#       --allocation-method Dynamic \
#       --location $region
#exit_if_error
## # Create IPA VM and its storage account for unmanaged data disks
vm_name="ipa${rg_name}"
storage_account=$(echo "${vm_name,,}storageacc"| sed "s/[!@#$%^&*()~\._-'{}\[|;:\"]//g")
/root/bin/az storage account create \
        --resource-group $rg_name \
        --name $storage_account \
        --location $region \
        --sku ${sku_type} \
        --kind Storage
exit_if_error

/root/bin/az vm create \
--resource-group $rg_name \
--name $vm_name \
--admin-username $admin_username \
--admin-password $admin_password \
--image $ipa_os_image \
--size $ipa_os_size \
--location $region  \
--availability-set $availset_master \
--nsg $nsg_name  \
--subnet $subnet_name \
--vnet-name $vnet_name \
--private-ip-address ${ipa_static_ip} \
--public-ip-address "" \
--use-unmanaged-disk \
--storage-account $storage_account \
--os-disk-name ${vm_name}-${os_disk_name}
exit_if_error


## Create Management VM with Private address and its storage account for unmanaged data disks
for m in $(seq 1 $number_of_mgmnt_node)
do
vm_name=MGMNT0${m}${rg_name}
storage_account=$(echo "${vm_name,,}storageacc"| sed "s/[!@#$%^&*()~\._-'{}\[|;:\"]//g")
/root/bin/az storage account create \
        --resource-group $rg_name \
        --name $storage_account \
        --location $region \
        --sku ${sku_type} \
        --kind Storage
exit_if_error

/root/bin/az vm create \
--resource-group $rg_name \
--name $vm_name \
--admin-username $admin_username \
--admin-password $admin_password \
--image $os_image \
--size ${mgmnt_vm_type} \
--location $region  \
--availability-set $availset_master \
--nsg $nsg_name  \
--subnet $subnet_name \
--vnet-name $vnet_name \
--public-ip-address "" \
--use-unmanaged-disk \
--storage-account $storage_account \
--os-disk-name ${vm_name}-${os_disk_name}
exit_if_error

## Create Data servers with Private address only ###
for data in $(seq 1 $mn_data_disk_count)
do
/root/bin/az vm unmanaged-disk attach \
--resource-group $rg_name \
--vm-name $vm_name \
--caching ReadWrite \
--name "${vm_name}-data0${data}" \
--new \
--size-gb $data_disk_size_gb
exit_if_error

done # internal loop

# # Restarting VMs for allocating data disks
/root/bin/az vm restart --ids $(/root/bin/az vm list --resource-group $rg_name --query "[?name == '$vm_name'].id" -o tsv)

# AZ extension set customScript to  mount MGMT Node data disks
/root/bin/az vm extension set \
--resource-group ${rg_name} \
--vm-name ${vm_name} \
--name customScript \
--publisher Microsoft.Azure.Extensions \
--settings '{"fileUris": ["https://ansiblestorageacc.blob.core.windows.net/customscripts/scripts/customScript_azureMountDisk_v2.sh"],"commandToExecute": "bash customScript_azureMountDisk_v2.sh MGMT"}' \
--protected-settings ${CONF_PATH}/protected-storage-config.json
exit_if_error

done # outer loop


for d in $(seq 1 $number_of_data_node)
do
vm_name=DATA0${d}${rg_name}
storage_account=$(echo "${vm_name,,}storageacc"| sed "s/[!@#$%^&*()~\._-'{}\[|;:\"]//g")

/root/bin/az storage account create \
        --resource-group $rg_name \
        --name $storage_account \
        --location $region \
        --sku ${sku_type} \
        --kind Storage
exit_if_error
/root/bin/az vm create \
--resource-group $rg_name \
--name $vm_name \
--admin-username $admin_username \
--admin-password $admin_password \
--image $os_image \
--size ${data_vm_type} \
--location $region  \
--availability-set $availset_worker \
--nsg $nsg_name  \
--subnet $subnet_name \
--vnet-name $vnet_name \
--public-ip-address "" \
--use-unmanaged-disk \
--storage-account $storage_account \
--os-disk-name ${vm_name}-${os_disk_name}
exit_if_error

for data in $(seq 1 $dn_data_disk_count)
do
/root/bin/az vm unmanaged-disk attach \
--resource-group $rg_name \
--vm-name $vm_name \
--caching ReadWrite \
--name "${vm_name}-data0${data}" \
--new \
--size-gb $data_disk_size_gb
exit_if_error

done # internal loop

# # Restarting VMs for allocating data disks
/root/bin/az vm restart --ids $(/root/bin/az vm list --resource-group $rg_name --query "[?name == '$vm_name'].id" -o tsv)

# AZ extension set customScript to mount Data Node data disks
/root/bin/az vm extension set \
--resource-group ${rg_name} \
--vm-name ${vm_name} \
--name customScript \
--publisher Microsoft.Azure.Extensions \
--settings '{"fileUris": ["https://ansiblestorageacc.blob.core.windows.net/customscripts/scripts/customScript_azureMountDisk_v2.sh"],"commandToExecute": "bash customScript_azureMountDisk_v2.sh DATA"}' \
--protected-settings ${CONF_PATH}/protected-storage-config.json
exit_if_error

done # Outer Loop

# Auto-Peering
ansibleVNETID=$(/root/bin/az network vnet show --resource-group ${ansible_rg_name} --name ${ansible_vnet_name}  --query id --out tsv)
clusterVNETID=$(/root/bin/az network vnet show --resource-group ${rg_name} --name ${vnet_name} --query id --out tsv)

## Delete existing disconnected VNET Peer

for existingPeer in $(/root/bin/az network vnet peering list --resource-group  ${ansible_rg_name} --vnet-name $ansible_vnet_name --query "[?contains(peeringState,'Disconnected')].name" --out tsv);do
/root/bin/az network vnet peering delete --name $existingPeer --resource-group $ansible_rg_name --vnet-name $ansible_vnet_name
done

## Creating VNET Peers
/root/bin/az network vnet peering create --name ${ansible_rg_name}To${rg_name} --resource-group $ansible_rg_name --vnet-name $ansible_vnet_name --remote-vnet-id $clusterVNETID --allow-vnet-access --allow-forwarded-traffic
if [ "$?" -ne "0" ];then
echo "Ansible VNET: Not able to Peering with Cluster"
fi

/root/bin/az network vnet peering create --name ${rg_name}To${ansible_rg_name} --resource-group $rg_name --vnet-name $vnet_name  --remote-vnet-id $ansibleVNETID --allow-vnet-access --allow-forwarded-traffic
#

/root/bin/az vm list-ip-addresses -g $rg_name --output table