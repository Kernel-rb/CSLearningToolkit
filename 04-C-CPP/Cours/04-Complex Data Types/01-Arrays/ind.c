#include <stdio.h>

int main()
{
    int notes[5];
    int i ;
    for( i = 0 ; i < 5 ; i++)
    {
        printf("notes[%d] = %d \n" , i , notes[i]);
    }

    printf("notes[5] = %d \n" , notes[5]);
    printf("notes[500] = %d \n" , notes[500]);

    return 0;
}