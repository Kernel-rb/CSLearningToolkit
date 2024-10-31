#include <stdio.h>

int main ()
{
  int grades[2][2][2] = {1,2,3,4,5,6,7,8};
  int i,j,k;
  for (i=0; i<2; i++) {
    for (j=0; j<2; j++) {
      for (k=0; k<2; k++) {
    printf("grades[%d][%d][%d]=%d\n", i, j, k, grades[i][j][k]);
      }
    }
  }
  return 0;
}