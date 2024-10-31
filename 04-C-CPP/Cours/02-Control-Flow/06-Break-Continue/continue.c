#include  <stdio.h>

int main(){
    for(int i = 0 ; i < 11 ; i++){
        if(i == 5 ){
            continue;
        }
        printf("the value of i = %d  \n" , i);
    }
}