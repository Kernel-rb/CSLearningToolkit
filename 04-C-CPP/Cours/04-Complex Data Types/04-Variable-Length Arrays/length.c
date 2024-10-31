#include <stdio.h>
#include <stdlib.h>

int main( int argc , char *argv[])
{
    if (argc < 2){
        printf("> pls provide an integer arguments ");
        return 1;
    }
    else
    {
        int n = atoi(argv[1]);
        int grades[n];
        int i; 
        for( i = 0  ; i < n  ; i++){
            grades[i] = i ;    
        }
        for (i= 0 ; i <n ; i++){
            printf("grades[%d] = %d  \n" , i , grades[i]);
        }
    }
    return 0;
}