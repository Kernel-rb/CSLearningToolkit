#include <iostream>
using namespace std;

int main() {
    int a = 10;   // Déclare un entier `a` et lui donne la valeur 10
    int* p = &a;  // `p` est un pointeur qui stocke l'adresse de `a`

    cout << "Valeur de a: " << a << endl;         // Affiche 10
    cout << "Adresse de a: " << &a << endl;       // Affiche l'adresse de `a`
    cout << "Adresse stockée dans p: " << p << endl; // Affiche la même adresse (celle de `a`)
    cout << "Valeur pointée par p: " << *p << endl;  // Affiche 10 (valeur de `a`)

    *p = 20; // Modifie la valeur de `a` en utilisant le pointeur `p`

    cout << "Nouvelle valeur de a: " << a << endl;   // Affiche 20

    return 0;
}

