#include <stdio.h>


int main(){
    int   a  = 11;
    float b  = 1234.45f;
    double c  = 56.465456445645645;
    double d[] = {a , b , c};
    printf("a= %d , b=%f , c=%lf , d=[%.3f , %.3f , %.3f] \n" , a, b ,c , d[0], d[1],d[2]);
    return 0;
}