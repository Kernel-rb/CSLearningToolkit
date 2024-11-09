// la methode try catch permet de gerer les erreurs dans le code
try {
    const a = 10 / 0;
    console.log(a);
} catch (e) { 
    console.log(`Error : ${e}`);
} 