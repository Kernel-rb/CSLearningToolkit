#include <stdio.h>  
#include <stdlib.h>

int main(){
    char intString[] = "12";
    char floatString[] = "1,2";
    int myInt = atoi(intString); // convert STR => int 
    double myFloat = atof(floatString); // convert STR => float
    // ----------------------- STR =>   Number ------------------------
    printf("intString = %s , floatString = %s  \n" , intString , floatString);
    printf("myInt = %d , myFLoat = %.1f \n" , myInt , myFloat);
    // ----------------------- Number =>  string  ------------------------ 
    int a = 2;
    double b = 3.14;
    char aString[64] , bString[64];
    sprintf(aString , "%d" , a); 
    sprintf(bString , "%.2f" , b); 
    printf("the initial value of a is : %d , and b is : %.2f  \n" , a , b );
    printf("the value of aString is : %s , and the value of Bstring is : %s", aString , bString);
    return 0; 
}

