// i++ => i = i+ 1
//  === => l9iyam  data type

// n appartien à N  ([1, inf]) , si n est pair => n = 2 * k ( n % 2 = 0)

function somme_des_nmbr_paire(n){
    let somme = 0;
    for(let i = 1; i <= n; i++){
        if(i % 2 === 0){

            somme = somme + i;
        }
    }
    return `Valeur de n est ${n} et la somme des nombres pairs est ${somme}`;
}
console.log(somme_des_nmbr_paire(5))
console.log(somme_des_nmbr_paire(10))