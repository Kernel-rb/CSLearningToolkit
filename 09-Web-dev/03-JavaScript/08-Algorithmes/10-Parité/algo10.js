// khsna wa7d lfun li an3tiwha wa7d  arr[int]
// khsha t khrj lina wa7d output :
//  ila kan arr[i] => pair , khs treturni lina pair
// ila kan arr[i] => impair , khs tretruni lina impair
// flkher khs ikon 3ndna wa7d arr = ["pair" , "impair" , "pair"]

function array(arr){
    const resultat = [];
    for(let number in arr){
        const parite = ( number % 2 === 0)  ? "pair" : "impair";
        const sntx  = `${arr[number]} : ${parite}`;
        resultat.push(sntx);
    }
    return resultat
}

let testArr = [4,77]
console.log(array(testArr))
