// -----------------Classes----------------------------
class Agent {
    constructor(name, weapon, abilities) {
        this.name = name;
        this.weapon = weapon;
        this.abilities = abilities;
    }
}

const jett = new Agent("Jett", "Vandal", ["Updraft", "Dash"]);
const sova = new Agent("Sova", "Phantom", ["Owl Drone", "Hunter's Fury"]); 

console.log(jett);
console.log(sova);
console.log(jett.name);
console.log(sova.weapon);