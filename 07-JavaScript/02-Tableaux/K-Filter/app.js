// filter() permet de filtrer un tableau en fonction d'une condition

let number = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let even = number.filter(n => n % 2 === 0);
let oden = number.filter(n => n % 2 === 1);
console.log(even);
console.log(oden);