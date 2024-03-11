#include <stdio.h>


double multipleByTwo(double input)
{
    double twice = input * 2.0;
    return twice;
}


int main(int argc  , char *argv[])
{
    int age = 19;
    double salary =  1387.21;
    printf("double your salary is %3f  \n" , multipleByTwo(salary));
    return 0;
}