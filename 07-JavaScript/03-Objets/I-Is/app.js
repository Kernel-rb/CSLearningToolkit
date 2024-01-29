// la method Is() permet de tester l'égalité entre deux valeurs

console.log(Object.is(25, 25)); // true
console.log(Object.is('foo', 'foo')); // true
console.log(Object.is(25, '25')); // false  
console.log(Object.is({}, {})); // false
console.log(Object.is([], [])); // false
console.log(Object.is(NaN, NaN)); // true