// flat map return nouveux tableau avec les elements modifiés
const number = [1, 2, 3, 4, 5];
const powerofNumber = number.flatMap((num) => [num ** 2]);
console.log(powerofNumber);