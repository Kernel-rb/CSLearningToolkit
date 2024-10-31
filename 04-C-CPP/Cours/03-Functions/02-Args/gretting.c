#include <stdio.h>

void greeting(char *name) {
    printf("Hello, %s!\n", name);
}


int main(){
    greeting((char *)"kernel");
    greeting((char *)"Draneol");
    return 0;
} 