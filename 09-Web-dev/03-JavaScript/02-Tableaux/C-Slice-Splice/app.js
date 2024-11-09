// slice() : est un méthode qui permet de copier un tableau et de retourner un nouveau tableau.

let programmingLanguage = ["C++", "Python", "Java", "Rust", "Go"];
let myFavoriteProgrammingLanguage = programmingLanguage.slice(1, 4); // de l index 1 à 4 , est 4 non inclus 
console.log(myFavoriteProgrammingLanguage);
console.log(programmingLanguage);


// splice() : est une méthode qui permet de supprimer un ou plusieurs éléments d'un tableau.
let myOldStack = ["C++", "Python", "Java", "Rust", "Go"];
let myNewStack = myOldStack.splice(1, 2) // 1 => l index de début / 2 => le nombre d'éléments à supprimer
let futureStack = myNewStack.splice(1,0,"Scala") // 1 => l index de début / 0 => le nombre d'éléments à supprimer / "Scala" => l'élément à ajouter
console.log(futureStack);
console.log(myNewStack);
console.log(myOldStack);