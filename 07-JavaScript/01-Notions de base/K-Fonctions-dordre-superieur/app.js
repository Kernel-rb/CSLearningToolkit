// fonction d oredre superieur est une fonction qui prend une fonction en parametre ou qui retourne une fonction

function appliquer(x, y , f) {
    return f(x) + f(y);
}

function carre(x) {
    return x * x;
} 

const resultat = appliquer(2, 3, carre);
console.log(resultat);