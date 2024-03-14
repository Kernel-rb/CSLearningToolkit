#include <stdio.h>

int main(int argc  , char *argv[])
{
    int age = 30 ; //  kandeclariw an integer age o tn3tiw wa7d value = 30
    int *p ; // kadeclariw wa7d var "p" li tytpointi lina l int 
    p = &age;  // daba lpointer p typoiti l memory location dyal age 
    printf("the age = %d \n" , age);
    printf("p  = %p \n" , p);
    printf("*p  = %p \n" , *p);
    printf("the size of p = %ld \n " , sizeof(p));
    *p = 40; 
    printf("*p=%d \n", *p);
    printf("age = %d \n", age);
    return 0;
}