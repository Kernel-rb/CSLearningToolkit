<?php
// -------------------------------------------------------
for($i = 0 ; $i < 10 ; $i+=2){
    echo "- $i \n";
};
$notes = [10 , 8 ,15];
foreach($notes as $note){
    echo "- $note \n";
}

// -------------------------------------------------------
$eleves = [
    "cm2" => ["kernel", "marc"],
    "cm1" => ["dranoel" , "pel"]
];

foreach($eleves as $classes => $el){
    echo $classes . " :" . "\n";
    foreach($el as $name){
        echo "- ".$name."\n";
    }
}
// -------------------------------------------------------
$notes = [];
$input = null;
while(true){
    $input = readline("Entrez une note");
    if($input == "fin") break;
    $notes[] = (int)$input;
}

foreach($notes as $nt){
    echo "-".$nt."\n";
}
// -------------------------------------------------------
$horraire_overtures = [];
$h_o_input = null;
while(true){
    $h_o_input = readline("Entrez les horaires d'ouverture : ");
    if($h_o_input == 'fin') break;
    $horraire_overtures[] = $h_o_input;
}

$user_input = readline("Entrez une heure d'ouverture : ");
$magasin_ouvert = false;

foreach($horraire_overtures as $h_o){
    if($h_o === $user_input){
        $magasin_ouvert = true;
        break;  
    }
}

if($magasin_ouvert) {
    echo "Le magasin est ouvert.\n";
} else {
    echo "Le magasin est fermé.\n";
}

?>