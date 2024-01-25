// fonction callback est une fonction qui est passée en argument à une autre fonction

function effectuerTache(tache, callback) {
    console.log(`J'effectue la tâche ${tache}`);
    callback();
}

function afficher() {
    console.log("la tache est terminée");
}

effectuerTache("Nettoyer le cache", afficher)
