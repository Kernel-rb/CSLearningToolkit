#include <stdio.h>


int main()
{
    int grades[5] = {0 , 1 , 2 , 3 , 4};
    int i;
    for (i = 0 ; i < 5 ; i++){
        printf("grades[%d] = %d \n" , i , grades[i]);
    }
    return 0;
}