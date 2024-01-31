// ------Getter: est un moyen de récupérer des données d'un objet----------------

let obj = {
    _valeur: 5,
    get valeur() {
        console.log('On accède à la propriété valeur :');
        return this._valeur;
    }
}

console.log(obj.valeur); // On accède à la propriété valeur