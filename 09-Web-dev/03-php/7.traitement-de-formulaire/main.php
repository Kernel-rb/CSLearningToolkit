<?php
// $aDeviner = 120;
// $error = null;
// $success = null;
// $value = null; 
$title = "Formulaire HTML";
// if(isset($_POST["input"])){
//     $value = (int)$_POST["input"];
//     if($value> $aDeviner){
//         $error =  "Votre chiffre est trop grand";
//     }elseif($value < $aDeviner){
//         $error =  "Votre chiffre est trop petit";
//     }else{
//         $success =  "YAY";
//     }
    
// };

$fruits = ["fraise" => 2  , "chocolat" => 3 , "pomme" => 1];
$cornet = ["pot" => 2  , "cornet" =>  3];
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php echo $title ?></title>
    <!-- <style>
        .alert {
            padding: 15px;
            margin: 10px 0;
            border-radius: 5px;
            font-family: Arial, sans-serif;
            font-size: 16px;
            line-height: 1.5;
            display: flex;
            align-items: center;
            justify-content: space-between;
            width: 300px;
            margin: 10px auto;
        }
        .alert-success {
            background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
        }

        .alert-success .alert-icon {
            margin-right: 10px;
            color: #155724;
        }

        .alert-danger {
            background-color: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
        }

        .alert-danger .alert-icon {
            margin-right: 10px;
            color: #721c24;
        }
        .alert .close-btn {
            font-size: 20px;
            color: inherit;
            cursor: pointer;
        }

        .alert .close-btn:hover {
            color: #000;
        }
        .alert .alert-icon {
            font-size: 20px;
        }
    </style> -->
</head>
<body>

<!--<//?php if($error) : ?>
    <div class="alert alert-danger">
        <span class="alert-icon">&#9888;</span> 
        <//?php echo $error ?>
        <span class="close-btn" onclick="this.parentElement.style.display='none';">&times;</span>
    </div>
<// ?php elseif($success): ?>
    <div class="alert alert-success">
        <span class="alert-icon">&#10004;</span> 
        <//?php echo $success ?>
        <span class="close-btn" onclick="this.parentElement.style.display='none';">&times;</span>
    </div>
<//?php endif ?> -->

<form action="" method="POST">
    <!--
    <input type="number" name="input" placeholder="entre 0 et 250" value="<?= $value ?>">
    <input type="text" name="demo" value="Init">
    -->
    <input type="checkbox" name="fruits[]" value="fraise">   <label for="parfum1"> 🍓</label><br>
    <input type="checkbox" name="fruits[]" value="citron"><label for="parfum2"> 🍋</label><br>
    <input type="checkbox" name="fruits[]" value="chocolat"> <label for="parfum3">🍫</label><br>
    <!-- <input type="datetime-local" name="datetime[]"> -->
    <!-- <input type="file" name="files[]"> -->
    <!-- <input type="password" name="passwords[]"> -->
    <button type="submit">Enter</button>
</form>

<h2> GET :  </h2>
<pre>
    <?php print_r($_GET); ?>
</pre>

<h2> POST :  </h2>
<pre>
    <?php print_r($_POST); ?>
</pre>
</body>
</html>


<!--
Visibilité des données : GET est visible dans l'URL, POST ne l'est pas.
Limite de taille : GET a une limite de taille pour les données envoyées (dépend du navigateur), tandis que POST peut envoyer des données plus volumineuses.
Utilisation recommandée : GET pour récupérer des données sans effets secondaires ; POST pour les actions qui modifient ou affectent le serveur.
-->