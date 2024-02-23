#include <stdio.h>


int main(){
    int mult = 0 ;
    for(int i = 0 ; i <= 20 ; i++){
        mult = 5 * i ;
        if( mult == 80  ){
            printf("80 is in the first 20 multiples of 5 \n %d x 5 = %d \n" , i , mult);
            break;
        }
    }
    printf("Bye Bye ");
 }