#include <stdio.h>

int main(){
    int age ;
    printf("> Enter your age  : ");
    scanf("%i" , &age);
    int diff = 18  - age;  
    if(age < 18 ){
        printf("Your are under age , come ater  %d years \n" ,diff );
    }else if ( age > 18 ) {
        printf("Your are welcome feel free \n");
    }else if (age == 18 ){
        printf("Lucky One \n");
    }else{
        printf("enter a valid number  \n");
    }

    return 0;
}