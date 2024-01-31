function add(n) {
    somme = 0;
    for(let i = 1; i <= n; i++) {
        if (i % 2 === 0) {
            somme += i;
        }
    }
    console.log(somme);
}

add(6);