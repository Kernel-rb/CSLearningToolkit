const name = "kernel"
const nickname = "Panic"
const fullName = `${name} :  ${nickname}`


console.log(fullName);
console.log(name.charAt(0));
console.log(name.includes('e'));
console.log(name.toUpperCase());
console.log(name.toLowerCase());
console.log(name.indexOf('e'));
console.log(name.slice(0, 3));
console.log(name.split("").join("-"));
console.log(name.replace("k", "K"));

const concat = name.concat(" ", nickname);
console.log(concat); 

const txt = "lore ipsum dolor sit amet consectetur adipisicing elit. Quisquam, quibusdam."
console.log(txt.trim()); // supprime les espaces avant et après le texte
console.log(txt.trimStart()); // supprime les espaces avant le texte
console.log(txt.trimEnd()); // supprime les espaces après le texte
