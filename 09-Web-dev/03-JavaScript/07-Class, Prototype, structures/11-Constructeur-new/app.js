class Personne{
    constructor(nom, age) {
        this.nom = nom;
        this.age = age;
     }
}

const per1 = new Personne("ker", 2);
console.log(per1);
// -----------------Exemple 1-----------------
const now = new Date();
console.log(now);
// -----------------Exemple 1-----------------
const obj = new Object();
obj.nom = "ker";
console.log(obj);
// -----------------Exemple 2-----------------
const tab = new Array();
tab.push(1);
tab.push(2);
console.log(tab);

// -----------------Exemple 3-----------------
const str = new String("ker");
console.log(str);
// -----------------Exemple 4-----------------
const num = new Number(1);
console.log(num);