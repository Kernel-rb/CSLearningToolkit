#include <stdio.h>


int main(){
    const int x = 2;
    const double y = 1.5;
    // ----------------- double : ------------------
    double double_multi = x * y;
    double double_div  =  x / y ;
    // ----------------- int : ------------------
    int  int_multi = x * y;
    int  int_div  =  x / y ;

    // -------------------- Print :  -----------------------
    printf("x= %d , y = %lf  ,double_multi = %lf   , double_div =%lf , int_multi = %d , int_div=%d \n " , x , y , double_multi , double_div , int_multi , int_div );

    return 0;

}