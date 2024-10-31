/*
Write a function that determines whether an integer is prime. The function should take as input a single integer, and return a 1 if the input is prime, and a 0 if it is not.
*/

#include <stdio.h>

int isprime(int n)
{
    if (n <= 1) return 0;
    int i;
    for(i = 2 ; i  <n ;i++){
        if(n % i == 0) return 0;
    }
    return 1;
}