#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int year ;
    int month ;
    int day ; 

}date;

int main(void)
{
    date *calendar = malloc(sizeof(date) * 10);

    calendar[0].year = 2024;
    calendar[0].month = 3;
    calendar[0].day = 15;

    int i; 
    for(i = 1 ; i < 10 ; i++)
    {
        calendar[i].year = 2024;
        calendar[i].month = 3 ;
        calendar[i].day = 15 + i;
    }

    for(i = 0 ; i < 10 ; i++)
    {
        printf(
            "jour %d = %d/%d/%d \n",
            i+1,
            calendar[i].year ,
            calendar[i].month,
            calendar[i].day
        );
    }

    free(calendar);

    return 0;
}