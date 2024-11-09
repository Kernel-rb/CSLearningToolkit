// // une fonction asynchrone est une fonction qui va s'executer en arrière plan


// let interval  = setInterval(() => console.log('Hello'), 1000);

// //clearInterval(interval) permet d'arrêter l'execution de la fonction interval
// let timeout = setTimeout(() => clearInterval(interval), 5000);


output = () => console.log('Every 2 seconds')

output();

let time = setTimeout(output, 2000);
clearTimeout(time)