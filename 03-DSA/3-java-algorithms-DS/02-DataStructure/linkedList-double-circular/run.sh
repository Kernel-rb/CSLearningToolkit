#!/bin/bash


DEST_FILE="LinkedL"

echo "Stary compiling file :  $DEST_FILE "


javac  "$DEST_FILE.java";


if [[ $? -eq 0 ]]; then  
  echo "javac $DEST_FILE....."
  java "$DEST_FILE"
else 
  echo "Erreur : javac stoped with an issue"

fi
