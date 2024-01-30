// ! y a pas de doublons dans un ensemble && les valeus sont uniques !
// ! y a des operations sur les ensembles : union, intersection, difference, difference symetrique !



// ensemble vide : 
const ensembleVide = new Set();
console.log(ensembleVide);
// ajouter des valeurs dans l'ensemble vide :
ensembleVide.add(1);
ensembleVide.add(2);
console.log(ensembleVide);
// supprimer des valeurs dans l'ensemble vide :
ensembleVide.delete(2);
console.log(ensembleVide);
// verifier si une valeur existe dans l'ensemble vide :
console.log(ensembleVide.has(1));
console.log(ensembleVide.has(2));

// compter le nombre de valeurs dans l'ensemble vide :
console.log(ensembleVide.size);
// supprimer toutes les valeurs dans l'ensemble vide :
ensembleVide.clear();
console.log(ensembleVide);


console.log('----------------------');




// ensemble avec des valeurs :
const ensemble = new Set([1, 2, 3]);
console.log(ensemble);

for (const el of ensemble) {
    console.log(el);
}

console.log('----------------------');


const ensembleTrois = new Set([1, 2]);
const ensembleQuatre = new Set([2, 3, 4]);

const union = new Set([...ensembleTrois, ...ensembleQuatre]);
console.log(union);

const intersection = new Set([...ensembleTrois].filter(el => ensembleQuatre.has(el)));
console.log(intersection);

const difference = new Set([...ensembleTrois].filter(el => !ensembleQuatre.has(el)));
console.log(difference);