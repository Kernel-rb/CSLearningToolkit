<?php

require 'nbpn.php';

if(!isset($_GET['id'])){
    echo "<p>Aucun Identifiant. </p>";
    exit;
}

$id = $_GET['id']; 

if( $id < 1 || $id > 839){
    echo "<p> Id invalide <p>";
    exit;
}


$req = $bd->prepare("SELECT * FROM nobels WHERE id = :id");
$req->bindValue(':id' , $id , PDO::PARAM_INT);
$req->execute();

$l = $req->fetch(PDO::FETCH_ASSOC);

echo "<ul>
        <li>Nom Complet : {$l['name']} </li>
        <li>Catégorie : {$l['category']} </li>
        <li>Année : {$l['year']} </li>
        <li>Pays : {$l['county']} </li>
        <li>Motivation : {$l['motivation']} </li>
    </ul>"
?>



<form actian="" method="GET">
    <Label for="id"> Enter an Id :  </label> <br>
    <input type="number" id="id" name="id" min="1" required>
    <button type=""> Enter
</form>
