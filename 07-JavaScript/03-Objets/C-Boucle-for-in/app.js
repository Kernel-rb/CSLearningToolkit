const player = {
    name: 'Mario',
    life: 100,
    speed: 50,
    xp: 0,
}

for (let key in player) {
    console.log(`${key} : ${player[key]}`); // name : Mario, life : 100, speed : 50, xp : 0
}


for (let key in player) {
    if (player.hasOwnProperty(key)) { // hasOwnProperty() permet de vérifier si la propriété appartient à l'objet
        console.log(`${key} : ${player[key]}`);
    }
}