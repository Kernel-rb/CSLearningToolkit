const rep = ["a", "a", "a"];
const form = document.querySelector(".quizz-form");

form.addEventListener("submit", funcForm)

function funcForm(e) {
    e.preventDefault();
    const res = [];
    const inputs = document.querySelectorAll("input[type='radio']:checked");
    inputs.forEach((radioBtn, index) => {
        if(radioBtn.value === rep[index]) {
            res.push(true);
        } else {
            res.push(false);
        }
    });
    funcResultat(res);
}

// 
const resultat = document.querySelector(".resultat");
const titreResultat = document.querySelector(".resultat h2");
const scoreResultat = document.querySelector(".resultat .score");
const infoResultat = document.querySelector(".resultat .info");


function funcResultat(res) {
    const nbError = res.filter(el => el !== true).length;
    console.log(nbError);
    switch(nbError) {
        case 0:
            resultat.style.backgroundColor = "rgb(0, 153, 51)";
            titreResultat.innerText = "Bravo, c'est un sans faute !";
            infoResultat.innerText = "";
            break;
        case 1:
            resultat.style.backgroundColor = "rgb(255, 153, 0)";
            titreResultat.innerText = "Vous y êtes presque !";
            infoResultat.innerText = "Retentez une autre réponse dans la case rouge, puis re-validez !";
            break;
        case 2:
            resultat.style.backgroundColor = "rgb(255, 51, 0)";
            titreResultat.innerText = "Encore un effort ...";
            infoResultat.innerText = "Retentez une autre réponse dans les cases rouges, puis re-validez !";
            break;
        case 3:
            resultat.style.backgroundColor = "rgb(255, 0, 0)";
            titreResultat.innerText = "Vous pouvez mieux faire !";
            infoResultat.innerText = "Retentez une autre réponse dans les cases rouges, puis re-validez !";
            break;
        default:
            "Wops, cas innatendu.";
    }
 }

