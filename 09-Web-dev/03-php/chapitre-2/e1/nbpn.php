<?php 

try {
    $bd = new PDO('pgsql:host=localhost;dbname=nobels', 'kernel', 'kernel');
    $bd->query("SET NAMES 'utf-8'");
    $bd->setAttribute(PDO::ATTR_ERRMODE , PDO::ERRMODE_EXCEPTION);
}catch(PDOException $e){
    die("Erreur : " . $e->getMessage());
}

$req = $bd->prepare("SELECT COUNT(*) AS count   FROM nobels");
$req->execute();
$table = $req->fetch(PDO::FETCH_ASSOC);

?>
