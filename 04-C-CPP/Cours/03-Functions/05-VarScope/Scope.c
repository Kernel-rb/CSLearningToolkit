#include <stdio.h>

float myGlob = 3.14;

void myFunc(void) {
    int myInt = 8;
    printf("my favourite number is %d\n", myInt);
    printf("my favourite float is %.2f\n", myGlob);
//  printf("my favourite letter is $c\n", myChar); // THIS WOULD NOT WORK
}

int main() {
    char myChar = 'x';
    printf("my favourite letter is %c\n", myChar);
    myFunc();
    printf("my favourite float is %.2f\n", myGlob);
//  printf("my favourite number is %d", myInt); // THIS WOULD NOT WORK
    return 0;
}
