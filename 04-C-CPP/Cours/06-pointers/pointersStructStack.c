#include <stdio.h>

typedef struct {
    int day;
    int month;
    int year;
} date ;


int main(void)
{
    date today;
    today.day = 14;
    today.month = 3 ;
    today.year = 2024;



    printf("the day is %d/%d/%d \n" , today.day , today.month , today.year );
    return 0;
}