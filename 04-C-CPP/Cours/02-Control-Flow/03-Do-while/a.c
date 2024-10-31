#include <stdio.h>


int main(){
    int number = 1;
    printf("Multi table for 5 \n");
    do {
        int multi = 5 * number ;
        printf("5 x %d = %d \n" , number ,multi);
        number++;
    }
    while(number <= 10);
}