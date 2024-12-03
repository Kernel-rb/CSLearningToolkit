// inspired by : @Dr jonas Birch (https://www.youtube.com/watch?v=mXoWlrzb1Ok&t=23191s&ab_channel=drJonasBirch)

#include <stdio.h>
#include <sys/socket.h>

#include <netinet/in.h>
#include <arpa/inet.h>


#define GOOGLE_IP "216.58.214.67"  /* google.fr */
#define PORT 80  /* http */

#define COLOR_RED "\33[0:31m\\]" 
#define Color_end "\33[0m\\]" // To flush out prev settings
#define LOG_RED(X) printf("%s %s %s",Color_Red,X,Color_end) // output in RED
                                                            //
                                                            //
int main()
{
    int s;
    socket_addr_in sock;  
    
    // socket(int domaine , int type , int protocol);
    // INET => IPv4
    // return : fd on success , -1 on fail
    s = socket(AF_INET , SOCK_STREAM , 0);
    if(s <  0 ){
        LOG_RED("ERROR IN SOCKET()");
        return -1;
    }

    // destination IP 
    sock.sin_addr.s_addr = inet_addr(GOOGLE_IP);
