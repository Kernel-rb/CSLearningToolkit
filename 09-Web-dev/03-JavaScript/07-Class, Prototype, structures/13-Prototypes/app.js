function personne(nom) {
    this.nom = nom;
}

personne.prototype.manger = function () {
    console.log(`${this.nom} mange`);
}

const per1 = new personne("kernel");

per1.manger();