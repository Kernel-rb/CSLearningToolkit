// ---- Setter : est une méthode qui permet de modifier une propriété d'un objet----------------

class Exemple{
    _valeur = 0;
    get valeur() {
        console.log(' from getter')
        return this._valeur;
    }

    set valeur(newvalue) {
        console.log(' from setter')
        this._valeur = newvalue;
        if (newvalue <= 0) {
            this._valeur = 0;
        }
    }
}

let obj = new Exemple();

obj.valeur = 5;
console.log(obj.valeur);
obj.valeur = -1;  
console.log(obj.valeur);