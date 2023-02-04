#! /bin/sh

message=""

if [ "$1" = "" ]
then message="commit message 아 귀찮아"
else message=$1
fi

git add .
git commit -m "$message"
git push



