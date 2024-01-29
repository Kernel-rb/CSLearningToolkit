// tan => Methode de l'objet Math qui retourne la tangente d'un nombre

// Math.tan(x) => x : nombre en radian
console.log(Math.tan(0)); // 0
console.log(Math.tan(1)); // 1.5574077246549023


function tan(x) {
    return Math.sin(x) / Math.cos(x);
}

