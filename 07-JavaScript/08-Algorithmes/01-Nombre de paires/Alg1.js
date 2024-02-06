function nombre_paire(n) {
    let somme = 0;
    for (let i = 1; i <= n; i++){
        if (i % 2 === 0) {
            somme += i;
        }
    }
    return somme
}
console.log(nombre_paire(6))
console.log(nombre_paire(7))
console.log(nombre_paire(8))