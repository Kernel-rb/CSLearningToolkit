// fn classsique

function hello() {
    console.log("Hello World");
}

let res = hello();

// return

let name = "kernel";

function greeting() {
    return `Hello ${name}`;
}

res = greeting();
console.log(res);


// parametres

function calculat(x, y) {
    return x + y;
}

res = calculat(5, 10);
console.log(res);

// arrow function
const sayhi = () => {
    console.log("hi")
}

const add = (x, y) => {
    return x + y;
}

console.log(add(5, 10));