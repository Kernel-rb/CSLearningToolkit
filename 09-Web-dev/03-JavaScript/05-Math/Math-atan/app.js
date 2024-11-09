// atan calculer l arc tangente d'un nombre entre -1 et 1 et retourne l'angle en radian

// Math.atan(1) => 0.7853981633974483
// Math.atan(0) => 0
// Math.atan(-1) => -0.7853981633974483
// Math.atan(2) => 1.1071487177940904

function radiantoDegrees(radian) {
    return radian * 180 / Math.PI;
}

console.log(radiantoDegrees(Math.atan(1)));
console.log(radiantoDegrees(Math.atan(0)));
console.log(radiantoDegrees(Math.atan(-1)));