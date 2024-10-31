#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int year;
    int month;
    int day;
} date;

int main(void)
{
    date *today;
    today = (date*)malloc(sizeof(date));

    // the explicit way of accessing fields of our struct
    (*today).day = 14;
    (*today).month = 3;
    (*today).year = 2024;

     // the more readable shorthand way of doing it

    today->day = 14;
    today->month = 3;
    today->year = 2024;

    printf("the day is : %d/%d/%d\n" , today->day , today->month , today->year);
    free(today);

    return 0; 


}