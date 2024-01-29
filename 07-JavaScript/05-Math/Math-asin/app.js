// asin => calculer arc sinus d'un nombre entre -1 et 1 et retourne l'angle en radian

// Math.asin(1) => 1.5707963267948966
// Math.asin(0) => 0
// Math.asin(-1) => -1.5707963267948966
// Math.asin(2) => NaN
// Math.asin(Infinity) => NaN

function radiantoDegrees(radian){
    return radian * 180 / Math.PI;
}

console.log(radiantoDegrees(Math.asin(1)));
console.log(radiantoDegrees(Math.asin(0)));
console.log(radiantoDegrees(Math.asin(-1)));