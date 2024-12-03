#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <fcntl.h>

int main() {
    if(mkfifo("fifo-0", 0777) == -1 ){
        // file already eaxist
        if(errno != EEXIST){
            printf("Couldn't create fifo");
            return -1;
        }
    }
    printf("Opening....");
    int fd = open("fifo-0",O_WRONLY);
    printf("Your are in !!");
    printf("Write done");
    close(fd);
    int x = 10;
    int y = 22; 
    if( write(fd , &x , sizeof(int)) == -1) return 2;
    printf("Closeed");
    if( write(fd , &y , sizeof(int)) == -1) return 2;

    

    if( write(fd , &x , sizeof(int)) == -1) return 2;
    return 0;

}

