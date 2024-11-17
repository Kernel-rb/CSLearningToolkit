<?php
require "functions.php";

$parfums = ["fraise" => 3, "chocolat" => 5, "vanille" => 3];
$cornet = ["pot" => 2, "cornet" => 3];
$supplement = ["pepites de choco" => 1, "chantilly" => 0.5];

$commande = [];
$prix_totale = 0;

if (isset($_GET["p"])) {
    foreach ($_GET["p"] as $p) {
        if (isset($parfums[$p])) {
            $commande[] = $p;
            $prix_totale += $parfums[$p];
        }
    }
}

if (isset($_GET["s"])) {
    foreach ($_GET["s"] as $s) {
        if (isset($supplement[$s])) {
            $commande[] = $s;
            $prix_totale += $supplement[$s];
        }
    }
}

if (isset($_GET["c"])) {
    foreach ($_GET["c"] as $c) {
        if (isset($cornet[$c])) {
            $commande[] = $c;
            $prix_totale += $cornet[$c];
        }
    }
}
?>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Composer votre glace</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            margin: 20px;
        }
        h1, h3 {
            color: #5A9;
        }
        .checkbox {
            margin-bottom: 10px;
        }
        label {
            font-size: 16px;
        }
        button {
            background-color: #5A9;
            color: white;
            border: none;
            padding: 10px 15px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background-color: #488;
        }
        .order-summary {
            background-color: #fff;
            border: 1px solid #ddd;
            padding: 15px;
            border-radius: 5px;
            margin-bottom: 20px;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        ul li {
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
    <div class="order-summary">
        <h3>Votre commande :</h3>
        <ul>
            <?php foreach ($commande as $item): ?>
                <li><?= htmlspecialchars($item) ?></li>
            <?php endforeach; ?>
        </ul>
        <p>
             Prix total : <?= "$prix_totale €" ?>
        </p>
    </div>

    <h1>Composer votre glace :</h1>
    <form action="exercice.php" method="GET">
        <?php foreach ($parfums as $p => $prix): ?>
            <div class="checkbox">
                <label>
                    <?= checkbox('p', $p, $_GET) ?>
                    <?= htmlspecialchars($p) ?> - <?= "$prix €" ?>
                </label> 
            </div>
        <?php endforeach; ?>

        <?php foreach ($cornet as $c => $prix_cornet): ?>
            <div class="checkbox">
                <label>
                    <?= radio('c', $c, $_GET) ?>
                    <?= htmlspecialchars($c) ?> - <?= "$prix_cornet €" ?>
                </label> 
            </div>
        <?php endforeach; ?>

        <?php foreach ($supplement as $s => $prix_supplement): ?>
            <div class="checkbox">
                <label>
                    <?= checkbox('s', $s, $_GET) ?>
                    <?= htmlspecialchars($s) ?> - <?= "$prix_supplement €" ?>
                </label> 
            </div>
        <?php endforeach; ?>

        <button type="submit">Composer votre glace</button>
    </form>

    <h2>GET :</h2>
    <pre><?php print_r($_GET); ?></pre>

    <h2>POST :</h2>
    <pre><?php print_r($_POST); ?></pre>
</body>
</html>
