#include <stdarg.h>
#include <stdio.h>

int somme(int nombreArguments, ...) {
    va_list listeArguments; 
    int somme = 0;

    va_start(listeArguments, nombreArguments); 

    for (int i = 0; i < nombreArguments; i++) {
        somme += va_arg(listeArguments, int); 
    }

    va_end(listeArguments);

    return somme;
}

int main() {
    printf("%d \n", somme(3, 1, 2, 3)); // 1 + 2 + 3 = 6
    printf("%d \n", somme(4, 10, 20, 0, -8)); // 10 + 20 + 0 + (-8) = 22

    return 0;
}
