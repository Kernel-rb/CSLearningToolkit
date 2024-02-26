#include <stdio.h>



int main()
{
    int notes[5] = {[0] = 10, [2] = 9 , [4] = 20};
    int i ; 
    for (i = 0  ; i < 5  ; i++) 
    {
        printf("note de la %d personne est = %d \n" , i+1 , notes[i]);
    } 
    return 0;
}
