<?php
//-----------------------------------------------
$age = 20;
function bonjour($name = null) {
    global $age; 
    if($name === null) return "Bonjour \n";
    return "Bonjour $name , your age : $age \n";
}
echo bonjour("kernel");
//-----------------------------------------------

function repondre_oui_non($phrase){
    return $phrase === "oui" ? true : false;
}
$input = readline("Entrez une phrase : ");
echo  repondre_oui_non($input);
?>