// Regex est une expression régulière qui permet de vérifier si une chaine de caractère correspond à un format particulier

const des = "Bonjour, je suis Kernel et ma version est la 4.20.0";

// d => digit  && g => trouver tous les chiffres de maniere globale && i => insensible à la casse && D => non digit && S => non espace && s => espace && w => caractère alphanumérique && W => non alphanumérique
// const regex = /\d/g;
// const regex = /\d/gi;
// const regex = /\D/g;
// const regex = /\D/gi;
// const regex = /\S/g;
// const regex = /\s/g;
// const regex = /\w/g;
// const regex = /\W/g;
// const regex = /[A-Z]/g; tous les majuscules
// const regex = /[^¨A-Z]/g; tous les minuscules
// const regex = /[a-z]/g; tous les minuscules
// const regex = /[0-9]/g; tous les chiffres
// const regex = /./g; n importe quel caractère
// const regex = /$/g; a la fin de la chaine de caractère
// const regex = /^/g; au debut de la chaine de caractère
// const regex = /[abc]/g; tous les a, b et c
// const regex = /pattern*/; 0 ou plusieurs fois
// const regex = /pattern+/; 1 ou plusieurs fois
// const regex = /pattern?/; 0 ou 1 fois
// occurence c est le nombre de fois que le caractère doit se repeter
// const regex = /pattern{occurence}/; nombre de fois que le caractère doit se repeter
// const regex = /pattern{occurence, occurence}/; nombre de fois que le caractère doit se repeter
// const regex = /\bkernel\b/; // mot complet
// const regex = /\Bkernel\B/; // mot non complet
console.log(des.match(regex)); 