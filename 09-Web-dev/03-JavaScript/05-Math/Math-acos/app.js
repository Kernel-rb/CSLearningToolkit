// acos => arc cosine , il prend un nombre entre -1 et 1 et retourne l'angle en radian


// Math.acos(1) => 0
// Math.acos(0) => 1.5707963267948966
// Math.acos(-1) => 3.141592653589793
// Math.acos(2) => NaN
// Math.acos(Infinity) => NaN
// Math.acos(-Infinity) => NaN
console.log(Math.acos(1));
console.log(Math.acos(0));
console.log(Math.acos(-1));
console.log(Math.acos(2));

function radiantoDegrees(radian){
    return radian * 180 / Math.PI;
}

console.log(radiantoDegrees(Math.acos(1)));
console.log(radiantoDegrees(Math.acos(0)));
console.log(radiantoDegrees(Math.acos(-1)));