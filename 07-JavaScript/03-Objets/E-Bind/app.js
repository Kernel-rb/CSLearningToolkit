const jett = {
    name : "Jett",
    hp : 100,
    shield : 50,
    speed: 100,
    ult: 0,
}

function showStats(kda) {
    console.log(`
    Name : ${this.name}
    HP : ${this.hp}
    Shield : ${this.shield}
    Speed : ${this.speed}
    Ult : ${this.ult}
    KDA : ${kda}
    `);
}


const boundShowStats = showStats.bind(jett , "1.5")  ;
boundShowStats(10);