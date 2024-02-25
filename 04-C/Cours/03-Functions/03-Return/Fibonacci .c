#include <stdio.h>

// La récursivité est un concept de programmation où une fonction se définit en appelant elle-même.

int Fibonnaci(int n ){
    if (n ==0 ) return 0;
    else if (n ==1 ) return 1;
    else return Fibonnaci(n -1 ) + Fibonnaci(n -2); 
}



int main(){
    int n = 10;
    int fn = Fibonnaci(n);
    printf(" Your init number is %d  , after excuting Fiboonnaci  : %d  \n" , n , fn);
    return 0;
}