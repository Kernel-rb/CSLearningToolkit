#include <stdio.h>


int main(){
    int counter = 0 ;
    int i;
    for(i=1 ; i <=100 ; i++){
        counter = counter + i;
    }
    printf("the value of conter : %d and  i %d" , counter , i);
}