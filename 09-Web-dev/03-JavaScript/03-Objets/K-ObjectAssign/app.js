// !si on a deux objets avec des propriétés identiques, la dernière propriété écrase la première

const obj = {
    a: 1,
    b: 2,
};

const obj2 = {
    c: 3,
    d: 4,
};

const mergeObj = Object.assign(obj, obj2);
console.log(mergeObj); // { a: 1, b: 2, c: 3, d: 4 }
