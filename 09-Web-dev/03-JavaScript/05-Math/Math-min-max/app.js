// Math min max => permet de trouver le plus petit ou le plus grand nombre d'une liste de nombres
// Math.min(1, 2, 3) => 1
// Math.max(1, 2, 3) => 3
console.log(Math.min(1, 2, 3));
console.log(Math.max(1, 2, 3));
console.log(Math.min(-1, -2, -3));
console.log(Math.max(-1, -2, -3));

const arr = [1, 2, 3];
console.log(Math.min(...arr));
console.log(Math.max(...arr));