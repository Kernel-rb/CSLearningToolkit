// copWithin() est une méthode qui permet de copier une partie d'un tableau et de la coller à un autre endroit du même tableau

let myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9];
myArray.copyWithin(0, 3, 6);
console.log(myArray);