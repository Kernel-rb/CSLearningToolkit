<?php
// init  connection 
$bd = new PDO('pgsql:host=localhost;dbname=nobels', 'kernel', 'kernel');
$bd->query("SET NAMES 'UTF-8'");
$bd->setAttribute(PDO::ATTR_ERRMODE , PDO::ERRMODE_EXCEPTION);

// check connection : 
if($bd == true){
    echo "<p> Connection </p>";
}

$req = $bd->prepare("SELECT * FROM nobels ORDER BY year DESC LIMIT 25");
$req->execute();

/*fetch : 
while($l = $req->fetch(PDO::FETCH_ASSOC)){
 echo "<p> Nom : " .   $l["name"]  . " ,  Year :" . $l["year"] . " , </p>";
}
*/

// fetch all : 

$t = $req->fetchAll(PDO::FETCH_ASSOC);

// count : 
$nb  = $req->rowCount();
echo "<p> $nb</p>";


?>
