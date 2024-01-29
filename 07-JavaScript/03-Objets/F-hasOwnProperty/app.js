const person = {
    name: 'John',
    age: 30
}

console.log(person.hasOwnProperty('name')); // true
console.log(person.hasOwnProperty('age')); // true
console.log(person.hasOwnProperty('adress')); // false


console.log('name' in person); // true
console.log('age' in person); // true
console.log('adress' in person); // false