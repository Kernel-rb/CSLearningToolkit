<?php
// Exemple de conditions en PHP

$note = 15;  // Exemple de note d'un étudiant
$stageDispo = true;  // Si un stage est disponible
$age = 20;  // L'âge de l'étudiant
$entreprise = "DiamondHands";  // Nom de l'entreprise

// Condition if-else
if ($note >= 10) {
    echo "L'étudiant a validé son stage.\n";
} else {
    echo "L'étudiant n'a pas validé son stage.\n";
}

// Condition switch
switch ($entreprise) {
    case "DiamondHands":
        echo "L'entreprise est DiamondHands.\n";
        break;
    case "Innovators Inc.":
        echo "L'entreprise est Innovators Inc.\n";
        break;
    default:
        echo "Entreprise non définie.\n";
        break;
}

// Condition ternaire
$resultat = ($age >= 18) ? "Adulte" : "Mineur";
echo "L'étudiant est un(e) $resultat.\n";

// Condition combinée
if ($stageDispo && $note >= 10) {
    echo "L'étudiant peut commencer son stage.\n";
} elseif (!$stageDispo) {
    echo "Aucun stage disponible.\n";
} else {
    echo "L'étudiant doit améliorer sa note avant de commencer le stage.\n";
}
?>
