#!/bin/bash

# stdin => 0  , stdout => 1  , stderr => 2 
# $0 => name script , $1 .... args , $# nb of arg 

read -p  "enter a f name and l name :" f_name  l_name
echo "your name : $f_name $l_name !"
