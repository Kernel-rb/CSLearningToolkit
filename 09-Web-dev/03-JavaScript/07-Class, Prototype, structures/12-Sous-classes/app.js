// sous class sont des class qui herite d'une autre class pour avoir les meme propriété et methode

class Animal {
    constructor(nom) {
        this.nom = nom;
    }
    manger() {
        console.log(`${this.nom} mange`);
    }
}

class Chat extends Animal {
    constructor(nom, race) {
        super(nom);
        this.race = race;
    }

    dormir() {
        console.log(`${this.nom} dort`);
    }
}


const monChat = new Chat("kitty", "siamois");

console.log(monChat.nom);
console.log(monChat.race);
monChat.manger();
monChat.dormir();