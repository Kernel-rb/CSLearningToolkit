// Number
let a = 2;
console.log(a);
// Decimal 
let b = 2.5;
console.log(b);
// String 
let hello = "Hello";
let world = 'World';
let str = `${hello} ${world}`;
console.log(str);
// Boolean
let isTrue = true;
let isFalse = false;

// Null => absence de valeur
let empty = null;
console.log(empty);

// undefined => variable non définie
let undef;
console.log(undef);

// Object 
let person = {
    name: "Saif",
    age: 19 ,
    information : function(){
       console.log(`My name is ${name} and I'm ${age} years old`);
    }
};
console.log(person);

// Array
let programmingLanguages = ["Javascript", "Python", "C++", "Java"];
let numbers = [1, 2, 3, 4, 5];
console.log(programmingLanguages);

// function => bloc de code réutilisable pour effectuer une tâche spécifique
function addition(a, b) {
    return a + b;
}
console.log(addition(2, 3));
