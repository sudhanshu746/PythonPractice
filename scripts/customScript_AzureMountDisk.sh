$MKDIR=/bin/mkdir
$LSBLK=/bin/lsblk
$CHMOD=/bin/chmod
$MOUNT=/bin/mount
$MKFS=/sbin/mkfs

all_data_disks=$($LSBLK --nodeps -n -o NAME,TYPE,MAJ:MIN|awk '{split($NF,a,":"); if(a[2] >= 32 && $2 == "disk") print $1;}')

incr=0
for disk in ${all_data_disks};do
	if [ -z "$($MOUNT|grep ${disk})" ]; then
		MOUNT_DIR="/MNT/DATA0${INCR}"
		# Creating mount directory with permission
		$MKDIR ${MOUNT_DIR} && $CHMOD -R 755 ${MOUNT_DIR} ;
		# Format disk with EXT4 filesystem
		echo y | $MKFS -t ext4 /dev/${disk}
		## Mount 
	fi
incr=$(expr $incr + 1)
done

