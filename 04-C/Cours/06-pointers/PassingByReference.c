#include <stdio.h>

void double(int *x)
{
    *x = *x * 2;
}

int main(void)
{
    int y = 3 ; 
    printf("the value of y = %d \n" , y);
    double(&y); // adress of y
    printf("the new value after the double func , y = %d /n" , y);
    return 0;
}