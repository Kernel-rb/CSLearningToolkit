#!/bin/bash

global_var="hy i'm a global var"

print_name(){
	local local_var="local var is here"
	echo "global var : $global_var"
	echo local_var
}


v_print_name(){
	echo "$global_var"
	echo $local_var #  not in the scoop 
}


print_name
v_print_name
