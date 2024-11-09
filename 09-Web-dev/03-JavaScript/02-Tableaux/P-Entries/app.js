// Entries est un module qui permet de gérer les entrées de l'application

const map = new Map();
map.set('name', 'kernel');
map.set('age', '19');

const enties = map.entries();
console.log(...enties);


const tab = ["pomme", "poire", "banane"];
const entries = tab.entries();
console.log(...entries);