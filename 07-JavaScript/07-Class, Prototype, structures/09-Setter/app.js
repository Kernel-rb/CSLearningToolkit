class Exemple{
    _valeur = 0;

    get maValeur(){
        console.log('Getter appelé');
        return this._valeur
    }

    set maValeur(nouvelleValeur){
        console.log("Setter appelé");
        if(nouvelleValeur >= 0){
            this._valeur = nouvelleValeur;
        }else {
            console.error("La valeur doit etre supérieure ou égale à zero")
        }
    }
}


 