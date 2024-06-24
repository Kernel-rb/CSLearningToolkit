#include <stdio.h>

int main(void){
    int a = 0; 
    printf("%d" , a++);
    return 0;
}

/*
- What is the diff been a++ and ++a?
    a++ is post increment, it will increment the value of a after the statement is executed. ( a = a + 1)
    ++a is pre increment, it will increment the value of a before the statement is executed. ( a = a + 1)
*/