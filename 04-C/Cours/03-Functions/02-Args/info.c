#include <stdio.h>

void info(char name[] , int age){
    printf("Name =>  %s , age => %d \n" , name , age);
}



int main(){
    info((char * ) "kernel" ,19 );
    return  0 ;
}