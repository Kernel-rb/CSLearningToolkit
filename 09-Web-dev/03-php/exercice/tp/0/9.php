<?php 
if(isset($_GET["nombre"])){
    $nombre = $_GET["nombre"];
    if(preg_match('/^-?\d+$/' , $nombre)){
        echo "La valeur \"$nombre\" est un nombre entier.<br>";
    }else {
        echo "La valeur \"$nombre\" n'est pas un nombre entier.<br>";
    }
}else{
    echo "Aucun paramètre 'nombre' trouvé dans l'URL.<br>";
}
?>


<form method="GET" action="">
    <label for="nombre"> Saisir un nombre</label>
    <input type="text" name="nombre" id="nombre">
    <button type="submit">Valider</button>
</form>



