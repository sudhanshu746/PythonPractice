#!/bin/bash

input=$1
type=$(echo ${input}|awk '{print substr($0,1,4)}')

if [ 'DATA' == "${type}" ]; then
  typeset -i i=1
else
  typeset -i i=0
fi

for dev in $(lsblk -snib | grep disk | grep -v "-" |awk '{if ($7 == "") print $0}'|awk '{print $1}'|sort);
do
   mkdir -p /mnt/data0${i}
   /sbin/mke2fs -F -O has_journal,extents,huge_file,flex_bg,uninit_bg,dir_nlink,extra_isize -E lazy_itable_init -i 4194304  /dev/${dev}
   mount /dev/${dev} /mnt/data0${i}

   uuid=$(blkid /dev/${dev}|awk '{print $2}'|sed "s/\"//g")
   echo "${uuid}        /mnt/data0${i}  ext4    defaults,noatime,acl    0       0" >> /etc/fstab
   ((i=$i+1))
done