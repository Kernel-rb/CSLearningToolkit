#include <stdio.h>

int main ()
{

typedef struct {
    int a;
    int b;
    double myVector[5];
  }  myStruct;

 myStruct s1;

 s1.a = 10;
 s1.b = 20;
 int i;
 for (i=0; i<5; i++) {
   s1.myVector[i] = i;
 }

 printf("s1.a = %d\n",s1.a);
 printf("s1.b = %d\n",s1.b);
 printf("s1.myVector:\n");
 for (i=0; i<5; i++) {
  printf("%f  \n",s1.myVector[i]);
 }


 return 0;
}