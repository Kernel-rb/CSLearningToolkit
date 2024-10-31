#include <stdio.h>

int main() {
    int i , j;
    int n =6; 
    for(i = 0  ; i <=n ; i++){
        for( j = 0 ; j < n -i ; j++ ){
            printf(" ");
        }
        for(j = n-i ; j < n-i  + 2*i - 1 ; j++){
            
        printf("*");
        }
        printf("\n");
    };
    return 0;
}