// then : permet de récupérer la valeur de retour de la promesse

const myPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        const reussite = true;
        if (reussite) {
            resolve("Promesse tenue !");
        } else {
            reject("Promesse rompue !");
        }
    }, 2000);
});

myPromise.then((value) => {
    console.log(`Success : ${value}`);

}).catch((e) => {
    console.log(`Error : ${e}`);
});