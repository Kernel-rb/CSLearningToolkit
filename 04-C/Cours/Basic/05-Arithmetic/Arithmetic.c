#include <stdio.h> 

int main(){
    int a = 10 , b = 4 , c=100  , d =1;
    int result1 , result2 , result3;
    result1 = a*b + c*d ;
    result2 = (a * b)  + ( c* d) ; 
    result3 = a * (b +c) * d ; 
    printf("result1 = %d ,  result2  = %d , result3 =%d  \n" , result1 , result2 , result3);
    return 0;
}