#include <stdio.h>

int main ()
{
    typedef struct {
        int x  ;
        int y  ;
        int z  ;
    } Axe3D;

    Axe3D myPoints[10];
    int i;
    for (i = 0 ; i < 10 ; i++){
        myPoints[i].x = i;
        myPoints[i].y = i;
        myPoints[i].z = i;
    }
}