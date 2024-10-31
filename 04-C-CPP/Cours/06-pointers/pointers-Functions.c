#include <stdio.h>

int add(int a , int b )
{
    return a + b;
}

int substract(int a , int b)
{
    return a - b ;
}

int multiply( int a , int b)
{
    return a * b;
}

void doMath(int (*fn)(int a , int b) , int a , int b)
{
    int res = fn(a , b);
    printf("resultat = %d \n" , res);
}

int main(void)
{
    int a = 3;
    int b = 1 ;


    doMath(add , a , b);
    doMath(substract , a , b );
    doMath(multiply , a , b);

    return 0;

}