#!/bin/bash

age=18

if [[ $age -eq 18 ]]; then
    echo "lucky day"
elif [[ $age -gt 18 ]]; then
    echo "u can enter"
else
    echo "u have to be gt than 18"
fi
