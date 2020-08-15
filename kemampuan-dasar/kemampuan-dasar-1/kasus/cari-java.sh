#!bin/bash
DIRECTORY=$(pwd)
if find . -iname "*.java"; then
    echo "Ada file Java pada" $DIRECTORY
else
    echo "Maaf, tidak ada file java"

fi

##find /home -name *.jpg