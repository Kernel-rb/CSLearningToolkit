<?php
// $eleves = ["kernel" , "Marc" , [10, 20 , 15] , 45 ]
$eleves = [
    "nom" => "vambo",
    "prenom" => "kernel",
    "notes" => [10,15,16]
];
echo $eleves["notes"][0];
$eleves["notes"][3] = 8 ;
$eleves["notes"][] = 55 ;
print_r($eleves["notes"]);
?>