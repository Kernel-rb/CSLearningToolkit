#!/bin/bash

fruits=("apple" "banana" "cherry")

for i in "${fruits[@]}"; do
    echo "$i"
done

echo ${fruits[1]}
