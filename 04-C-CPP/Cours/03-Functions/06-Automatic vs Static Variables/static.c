#include <stdio.h>

void myFunc(){
    static num = 0;
    num++;
    printf("Called = {%d} \n" , num);
}


int main(){
    myFunc();
    myFunc();
    myFunc();
    myFunc();

    return 0;
}