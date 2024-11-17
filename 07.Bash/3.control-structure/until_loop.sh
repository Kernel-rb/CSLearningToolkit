#!/bin/bash 

counter=5

until [[ $counter -lt 1 ]];
do
	echo "counter => $counter";counter=$((counter - 1))
done	
