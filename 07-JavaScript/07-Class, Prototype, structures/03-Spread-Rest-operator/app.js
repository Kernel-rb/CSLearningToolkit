// -----------------Spread operator :----------------------------

const arr = [1, 2, 3];
const arr2 = [4, 5, 6];
const final = [...arr, ...arr2];
console.log(final);

// -----------------Objects----------------------------
const obj1 = { name: "kernel", age: 19 };
const obj2 = { isstudent: true, ...obj1 };
console.log(obj2);

// -----------------Rest operator :----------------------------

function myFucn(param1, param2, ...autreparam) {
    console.log(param1);
    console.log(param2);
    console.log(autreparam);
}
myFucn(1, 2, 3, 4, 5);