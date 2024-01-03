#include <stdio.h>

void affiche(int tab[], int taille);

void selection_sort( int tab[] , int taille);

int main() {
    int taille = 7;
    int tab[] = {2, 9, 1, 3, 4, 80, 5};

    affiche(tab, taille);

    return 0;
}

void affiche(int tab[], int taille) {
    for (int i = 0; i < taille; i++) 
        printf("[%d]", tab[i]);
   
}


void selection_sort( int tab[] , int taille){
    for (int i =0 ; i < taille -1 ; i++ ){
        int i_min =i, temp;
        for (int j = i+1 ; j < taille  ; j++){
            if ( tab[j] < tab[i_min]) i_min = j;
            if 
        }
        

    }
    
}
    
