let number = -10; // change the value to test the code

if (number > 0) {
    console.log(`The number ${number} is positive`);
}else if (number < 0) {
    console.log(`The number ${number} is negative`);
}else {
    console.log(`The number ${number} is zero`);
}
    
// another way to do it

let age = 18; // change the value to test the code
let sex = "M";
if (age >= 18 && sex === "M") {
    console.log(`Vous êtes M et vous êtes majeur`);
} else if (age >= 18 && sex === "F") {
    console.log(`Vous êtes une femme et vous êtes majeur`);
} else if (age <= 18 && sex === "M") {
    console.log(`Vous êtes un M et vous êtes mineur`);
}else {
    console.log(`Vous êtes une F et vous êtes mineur`);
}