<?php
require_once "Model.php";  
$m = Model::getModel();

if (!isset($_GET['id']) || !is_numeric($_GET['id']) || $_GET['id'] <= 0) {
    echo "<p>id not found or invalid </p>";
    exit;
}

$id = (int)$_GET['id'];
$ver_id = $m->get_nobel_prize_informations($id);

if (!$ver_id) {
    echo "<p>No Nobel Prize found with id: $id</p>";
} else {
    echo "<h1>Nobel Prize Information</h1>";
    echo "<p>Name: " . htmlspecialchars($ver_id['name']) . "</p>";
    echo "<p>Category: " . htmlspecialchars($ver_id['category']) . "</p>";
    echo "<p>Year: " . htmlspecialchars($ver_id['year']) . "</p>";
    echo "<p>Country: " . htmlspecialchars($ver_id['country']) . "</p>";
    echo "<p>Motivation: " . htmlspecialchars($ver_id['motivation']) . "</p>";
}
?>

