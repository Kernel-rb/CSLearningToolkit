// Promise.all() method qui prend un tableau de promesses en paramètre et retourne une promesse qui est résolue lorsque toutes les promesses du tableau sont résolues.


const prom1 = new Promise((resolve) => {
    setTimeout(() => {
        resolve("Promesse 1 tenue !");
    }, 1000);
});

const prom2 = new Promise((resolve) => {
    setTimeout(() => {
        resolve("Promesse 2 tenue !");
    }, 2000);
});

const prom3 = new Promise((resolve) => {
    setTimeout(() => {
        resolve("Promesse 3 tenue !");
    }, 3000);
});


Promise.all([prom1, prom2, prom3]).then((values) => {
    console.log(`Les 3 promesses sont tenues : ${values}`);
}).catch((e) => {
    console.log(`Error : ${e}`);
});