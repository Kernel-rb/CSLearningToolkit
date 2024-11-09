// arrow function :

const arrowFunction = () => {
    console.log('arrow function');
}
const res = arrowFunction();

// arrow function with parameters :

const addArrowFunction = (a, b) => {
    return a + b;
}
const res2 = addArrowFunction(2, 3);
console.log(res2);

// Shorter arrow function :
const multiArrowFunction = (a, b) => a * b;
const res3 = multiArrowFunction(2, 3);
console.log(res3);


const obj = {
    name: 'Saif',
    sayHy: function () { console.log(`Hello ${this.name}`) },
    sayBye: () => { console.log(`Bye ${this.name}`) },// arrow function don't have acces to this 
}
obj.sayHy();
obj.sayBye();