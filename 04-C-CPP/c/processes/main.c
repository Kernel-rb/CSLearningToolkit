#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <fcntl.h>

void p(){
    fork();
    printf("hello \n");
}

int main() {
    p();
    printf("h \n");
    return 0;
}

