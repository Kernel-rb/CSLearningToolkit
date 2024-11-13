<?php
$title = "Exercice 6";


$tabMagazines = [
    'le monde'              => ['frequence' => 'quotidien', 'type' => 'actualité', 'prix' => 220],
    'le point'              => ['frequence' => 'hebdo'    , 'type' => 'actualité', 'prix' => 80 ],
    'causette'              => ['frequence' => 'mensuel'  , 'type' => 'féminin'  , 'prix' => 180],
    'politis'               => ['frequence' => 'hebdo'    , 'type' => 'opinion'  , 'prix' => 100],
    'le monde diplomatique' => ['frequence' => 'mensuel'  , 'type' => 'analyse'  , 'prix' => 60 ],
    'libération'            => ['frequence' => 'quotidien', 'type' => 'actualité', 'prix' => 190],
];

$tabMagazinesAbonne = ['le monde', 'le monde diplomatique'];

// 1. Afficher tous les magazines triés
echo "<h2>1. Liste complète des magazines :</h2>";
$noms = array_keys($tabMagazines);
sort($noms);
echo implode(", ", $noms);

// 2. Afficher les quotidiens
echo "<h2>2. Liste des quotidiens :</h2>";
$quotidiens = array_filter($tabMagazines, function($magazine) {
    return $magazine['frequence'] === 'quotidien';
});
echo implode(", ", array_keys($quotidiens));

// 3. Afficher les magazines avec leurs propriétés
echo "<h2>3. Liste détaillée des magazines :</h2>";
echo "<ul>";
foreach($tabMagazines as $nom => $proprietes) {
    echo "<li>$nom (";
    echo implode(", ", array_values($proprietes));
    echo ")</li>";
}
echo "</ul>";

// 4. Calculer le prix total de l'abonnement
echo "<h2>4. Prix total de l'abonnement :</h2>";
$prixTotal = 0;
foreach($tabMagazinesAbonne as $magazine) {
    $prixTotal += $tabMagazines[$magazine]['prix'];
}
echo "L'abonnement aux magazines " . implode(" et ", $tabMagazinesAbonne);
echo " coûte $prixTotal euros.";

?>