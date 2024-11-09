// Operateur Mathematique : 

let a = 2;
let b = 3;
const add = a + b;
console.log(add);
const sub = a - b;
console.log(sub);
const mul = a * b;
console.log(mul);
const div = a / b;
console.log(div);
const mod = a % b; // reste de la division
console.log(mod);
const puissance = a ** b;
console.log(puissance);
a += 1; // a = a + 1
console.log(a);
a++; // a = a + 1
console.log(a);
a--; // a = a - 1
console.log(a);
a -= 1; // a = a - 1
console.log(a);
a *= 2; // a = a * 2
console.log(a);
a /= 2; // a = a / 2
console.log(a);
a %= 2; // a = a % 2
console.log(a);
a **= 2; // a = a ** 2
console.log(a);

// Comparaison : 

let inf = 2 < 3; 
console.log(inf); 
let sup = 3 > 2;
console.log(sup);
let infEgal = 2 <= 3;
console.log(infEgal);
let supEgal = 3 >= 2;
console.log(supEgal);

// Comparaison d'égalité :

let egal = 2 == 2; // egalité simple
console.log(egal);
let egalType = 2 === "2"; // egalité stricte
console.log(egalType);
let diff = 2 != 3; // difference simple
console.log(diff);
let diffType = 2 !== "2"; // difference stricte
console.log(diffType);

// Operateur logique :

let and = 2 < 3 && 3 > 2; // ET
console.log(and);
let or = 2 < 3 || 3 > 2; // OU
console.log(or);
let not = !(2 < 3); // NON
console.log(not);