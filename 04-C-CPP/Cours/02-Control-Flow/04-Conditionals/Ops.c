#include <stdio.h>


int main(){
    int i; 
    for(i = 1 ; i <= 10 ; i++ ){
        (i%2) ? printf("%d is odd \n , i") : printf("%d is even \n" , i );
    }
}