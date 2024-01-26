// Pop() : Supprime le dernier élément d'un tableau et retourne cet élément.
let fruit = ['Apple', 'Banana', 'Orange', 'Pineapple', 'Mango'];
let dernierFruitPop = fruit.pop(); 
console.log(dernierFruitPop);
console.log(fruit);


// Push(): Ajoute un ou plusieurs éléments à la fin d'un tableau et retourne la nouvelle taille du tableau.
let product = ["Keyboard", "Mouse", "Joypad", "Microphone"];
let newProduct = product.push("Headphone", "Speaker");
console.log(newProduct);
console.log(product);

// Shift(): Supprime le premier élément d'un tableau et retourne cet élément. Cette méthode modifie la longueur du tableau.
let city = ["Paris", "Lyon", "Marseille", "Bordeaux"];
let firstCity = city.shift();
console.log(firstCity);
console.log(city);


// unshift(): Ajoute un ou plusieurs éléments au début d'un tableau et retourne la nouvelle taille du tableau.

let porgrammingLanguage = ["C++", "Python", "Java"];
let newProgrammingLanguage = porgrammingLanguage.unshift("Rust", "Go");
console.log(newProgrammingLanguage);
console.log(porgrammingLanguage);