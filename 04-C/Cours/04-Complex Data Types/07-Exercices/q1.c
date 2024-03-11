#include <stdio.h>

#define MAXDATA 1024

typedef struct {
  double data[MAXDATA];
  int nrows;
  int ncols;
} Matrix;

void printmat(Matrix M);


Matrix matrixmult(Matrix A, Matrix B);

int main(int argc, char *argv[])
{
  Matrix A = { {1.2, 2.3,
                3.4, 4.5,
                5.6, 6.7},
               3,
               2};
  Matrix B = { {5.5, 6.6, 7.7,
                1.2, 2.1, 3.3},
               2,
               3}; 
  printmat(A);
  printmat(B);

   Matrix C = matrixmult(A, B);
   printmat(C);

  return 0;
}



// fnct pour afficher la matrice 
void printmat(Matrix M)
{
  int i, j;
  printf("[\n");
  for (i = 0; i < M.nrows; i++) {
    for (j = 0; j < M.ncols; j++) {
      printf("%lf ", M.data[i * M.ncols + j ]);
    }
    printf("\n");
  }
   printf("]\n\n");
}



// fnct pour la multiplication de 2 matrices
Matrix matrixmult(Matrix A, Matrix B)
{
  
}

