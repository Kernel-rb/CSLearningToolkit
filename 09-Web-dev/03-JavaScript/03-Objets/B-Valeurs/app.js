// primitifs siginifie que ne peuvent pas etres modifiés :
// string, number, boolean, null, undefined, symbol
let nb = 10;
let str = "Hello";
let bool = true;
let nul = null;
let und = undefined;
let symb = Symbol("id");

// reference siginifie que peuvent etres modifiés :(mutable)
// object, array, function et date
let obj = {
    name: "Kernel",
    age: 19,
    isStudent: true,
}
let tab = [1, 2, 3, 4, 5];
let func = () => console.log("Hello");
let date = new Date();

