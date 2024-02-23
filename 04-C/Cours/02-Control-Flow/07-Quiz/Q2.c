#include <stdio.h>

int main() {
  double x0 = 10;
  double xn;
  double x2 = 612;
  int i;
  for(i= 0 ; i <=5 ; i++){
    xn = x0 -(((x0*x0) - x2)/(2*x0));
    printf("x%d = %.12f, x%d = %.12f\n", i, x0, i+1, xn);
    x0 = xn;
  }


  return 0;
}