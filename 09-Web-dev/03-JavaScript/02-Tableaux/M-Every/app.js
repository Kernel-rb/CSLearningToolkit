let nb = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
// every() method tests whether all elements in the array pass the test implemented by the provided function.
let even = nb.every((element) => element % 2 === 0);
console.log(even);
let odd = nb.every((element) => element % 2 !== 0);
console.log(odd);
let number = nb.every((element) => typeof element === 'number');
console.log(number);