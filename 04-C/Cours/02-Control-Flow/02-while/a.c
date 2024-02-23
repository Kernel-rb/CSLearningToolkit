#include <stdio.h>


int main(){
    int counter = 0; 
    int i = 0;
    while(i <= 100){
        counter = counter + i; 
        i++;
    }
    printf("the value of the counter is %d and  the value of i is %d " , counter , i); 
}