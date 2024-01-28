// sort() est une méthode qui trie les éléments d'un tableau, dans ce cas-ci, les nombres sont triés par ordre croissant.
const sortArray = [0, 5, 2, 1, 6, 3];
sortArray.sort();
console.log(sortArray); // [0, 1, 2, 3, 5, 6]

const nb = [10, 5, 2, 3];
nb.sort((a, b) => a - b);
console.log(nb); // [2, 3, 5, 10]