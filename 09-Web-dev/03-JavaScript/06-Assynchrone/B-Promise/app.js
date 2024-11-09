//  Promise en JavaScript est un objet qui représente la complétion ou l'échec d'une opération asynchrone.

const myPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        const reussite = true;
        if (reussite) {
            resolve("Promesse tenue !");
        } else {
            reject("Promesse rompue !");
        }
    }, 1000);
});


myPromise.then((value) => {
    console.log(`Success : ${value}`);
}).catch((e) =>{
    console.log(`Error : ${e}`);
});
