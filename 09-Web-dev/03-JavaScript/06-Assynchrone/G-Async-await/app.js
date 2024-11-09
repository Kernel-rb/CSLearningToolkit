// await => est utilisé pour attendre la résolution d'une promesse
// async => est utilisé pour définir une fonction asynchrone
// await et async sont utilisés ensemble


function wait(delay) {
    return new Promise((resolve) =>
        setTimeout(() =>
            resolve(`Waited ${delay} ms`), delay)
    );
}


async function excute(){
    try {
        console.log("Start");
        const result = await wait(2000);
        console.log(result);
        const result2 = await wait(1000);
        console.log(result2);
        console.log("End");
    }catch(e){
        console.log(e);
    }
}

excute();