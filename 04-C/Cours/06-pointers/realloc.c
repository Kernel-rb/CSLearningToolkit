// RALLOC  => Resizing a variable
#include <stdio.h>
#include <stdlib.h>

void hyImAnVec(double vec[] , int n )
{
    int i ;
    for(i = 0 ; i <n ; i++)
    {
        printf("vec[%d]=%.3f\n", i, vec[i]);
    }
    printf("\n");
}



int main(void)
{
    double *vec = calloc(3 , sizeof(double));

    vec[1] = 3.14;
    hyImAnVec(vec , 3);

    vec = realloc(vec , sizeof(double) * 5 ); // resize the vec 
    hyImAnVec(vec , 5);


    vec[2] = 7.77;
    hyImAnVec(vec , 5);

    free(vec);
    return 0;
}


/* This is a multiple-line comment in C.
    It can span across multiple lines.
    It is often used to provide detailed explanations or disable sections of code. 
*/
