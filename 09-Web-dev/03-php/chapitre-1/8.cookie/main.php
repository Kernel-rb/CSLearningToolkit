<?php
$user = [
    "prenom" => "kernel",
    "nom" => "vambo",
    "age" => 20
];
setcookie("nom" , serialize($user));
?>

<a href="main.php?action=déconnecter">Deconnecter</a>
<form action="" method="POST">
    <input type="text" name="nom">
    <button type="submit">envoyer</button>
</form>