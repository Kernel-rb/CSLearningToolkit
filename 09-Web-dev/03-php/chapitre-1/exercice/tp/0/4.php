<?php
$title = "Exercice 4";

$t = [
    'english',
    'first'=>'html', 
    2 => 'css', 
    'best'=>'php', 
    'javascript',
    5 => 'jQuery'
];

// Affichage avec var_dump
echo "<h2>Résultat du var_dump :</h2>";
echo "<pre>";
var_dump($t);
echo "</pre>";

// Liste des valeurs
echo "<h2>Liste des valeurs :</h2>";
echo "<ol>";
foreach($t as $valeur) {
    echo "<li>$valeur</li>";
}
echo "</ol>";

// Liste des clés
echo "<h2>Liste des clés :</h2>";
echo "<ol>";
foreach($t as $cle => $valeur) {
    echo "<li>$cle</li>";
}
echo "</ol>";

?>