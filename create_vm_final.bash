# Intialization #
rg_name="HSDEV"
region="eastus2"
addressPrefix_default='10.0.0.0/16'
number_of_mgmnt_node=1
number_of_data_node=1
vnet_name="BDAAS_DEMO"
vm_size="Standard_DS14_v2"
admin_username="amol"
admin_password="Cognilytics123"
os_image="RedHat:RHEL:6.8:latest"
ipa_os_image="RedHat:RHEL:7.2:latest"
nsg_name=${rg_name}_NSG
nsg_rule="SSH"
vnet_name="${rg_name}_VNET"
subnet_name="${rg_name}_SUBNET"
public_ip_name="${rg_name}_PublicIP"


incr=0
address_space_exist=$(az network vnet list --query "[?contains(addressSpace.addressPrefixes,'${addressPrefix_default}')]")

while [[ $address_space_exist != "[]" ]];do
incr=$(expr $incr + 1)
addressPrefix='10.'${incr}'.0.0/16'
subnetPrefix='10.'${incr}'.0.0/24'
address_space_exist=$(az network vnet list --query "[?contains(addressSpace.addressPrefixes,'${addressPrefix}')]")
done

function exit_if_error {
if [[ $? -ne 0 ]];then
exit 1;
fi
}

## Execution ##
az group create --name $rg_name --location $region
exit_if_error

az network nsg create \
	--resource-group $rg_name \
	--name $nsg_name
exit_if_error

az network nsg rule create \
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

az network vnet create \
	--resource-group $rg_name \
	--name $vnet_name \
	--address-prefix $addressPrefix \
	--location $region
exit_if_error

az network vnet subnet create \
	--resource-group $rg_name \
	--name $subnet_name \
	--vnet-name $vnet_name \
	--address-prefix $subnetPrefix \
	--network-security-group $nsg_name 
exit_if_error

az network public-ip create \
	--name $public_ip_name \
	--resource-group $rg_name \
	--allocation-method Dynamic \
	--location $region
exit_if_error


### Create MGMT01 with public IP Address ###
az vm create \
    --resource-group $rg_name \
    --name MGMNT01${rg_name} \
    --admin-username $admin_username \
    --admin-password $admin_password \
    --image $os_image \
    --size $vm_size \
	--location $region \
	--nsg $nsg_name \
	--subnet $subnet_name \
	--vnet-name $vnet_name \
	--public-ip-address $public_ip_name
exit_if_error

## Create MGMT02 and MGMT03 servers with Private address only ###
for i in $(seq 2 $number_of_mgmnt_node)
do
az vm create \
    --resource-group $rg_name \
    --name MGMNT0${i}${rg_name} \
    --admin-username $admin_username \
    --admin-password $admin_password \
    --image $os_image \
    --size $vm_size \
	--location $region \
	--nsg $nsg_name \
	--subnet $subnet_name \
	--vnet-name $vnet_name \
	--public-ip-address ""
done
exit_if_error

for i in $(seq 1 $number_of_data_node)
do
az vm create \
    --resource-group $rg_name \
    --name DATA0${i}${rg_name} \
    --admin-username $admin_username \
    --admin-password $admin_password \
    --image $os_image \
    --size $vm_size \
	--location $region \
	--nsg $nsg_name \
	--subnet $subnet_name \
	--vnet-name $vnet_name \
	--public-ip-address ""
done
exit_if_error

az vm create \
    --resource-group $rg_name \
    --name ipa${rg_name} \
	--admin-username $admin_username \
    --admin-password $admin_password \
    --image $ipa_os_image \
    --size Standard_DS2_v2 \
	--location $region \
	--nsg $nsg_name \
	--subnet $subnet_name \
	--vnet-name $vnet_name \
	--public-ip-address ""
exit_if_error

az vm list-ip-addresses -g $rg_name --output table