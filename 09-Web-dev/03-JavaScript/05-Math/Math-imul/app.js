//Math imul => permet de multiplier deux nombres entiers de 32 bits et de renvoyer un entier de 32 bits

// Math.imul(2, 4) => 8
// Math.imul(-1, 8) => -8
// Math.imul(-2, -2) => 4
console.log(Math.imul(2, 4));
console.log(Math.imul(-1, 8));
console.log(Math.imul(-2, -2)); 
console.log(Math.imul(0xffffffff, 5)); // -5