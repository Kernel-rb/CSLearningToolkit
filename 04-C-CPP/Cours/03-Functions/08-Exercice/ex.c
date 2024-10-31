/*
- Write a function that computes the n Fibonacci number. Your function should be called fib and should take as input a single integer value n, and should return an integer value representing the n
Fibonacci number.

- Write your own function that doesn’t use recursion, but uses a loop instead.

*/

#include <stdio.h>

int fib( int n ){
    if(n ==0 ) return 0;
    if (n == 1) return 1;
    else {
        return fib(n -1 ) + fib(n-2);
    }

}