#include <stdio.h>


int main()
{
    int arr2[2][2] = {1,2,3,4};
    int  i , j ;
    for(i = 0 ; i <2 ; i++){
        for (j= 0 ; j < 2 ; j++){
            printf("arr[%d][%d] = %d \n" , i , j , arr2[i][j]);
        }
    }
    return 0 ;
}