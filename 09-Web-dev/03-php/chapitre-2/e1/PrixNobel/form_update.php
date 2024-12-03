<?php
require_once "Model.php";
require "begin.html";

if (!isset($_GET['id']) || (int)$_GET['id'] <= 0) {
    echo "Invalid or missing Nobel Prize ID.";
    exit;
}

$id = (int)$_GET['id'];
$m = Model::getModel();
$nobel = $m->get_nobel_prize_informations($id);

if (!$nobel) {
    echo "No Nobel prize found with this ID.";
    exit;
}
?>

<form action="update.php" method="POST">
    <input type="hidden" name="id" value="<?= htmlspecialchars($nobel['id']) ?>">Name: 
    <input type="text" name="name" value="<?= htmlspecialchars($nobel['name']) ?>" required><br> 
    Year <input type="number" name="year" value="<?= htmlspecialchars($nobel['year']) ?>" required><br>
    Category: <input type="text" name="category" value="<?= htmlspecialchars($nobel['category']) ?>" required><br>
    Birthdate: <input type="date" name="birthdate" value="<?= htmlspecialchars($nobel['birthdate']) ?>"><br>
    Birthplace: <input type="text" name="birthplace" value="<?= htmlspecialchars($nobel['birthplace']) ?>"><br>
    County: <input type="text" name="county" value="<?= htmlspecialchars($nobel['county']) ?>"><br>
    Motivation: <textarea name="motivation"><?= htmlspecialchars($nobel['motivation']) ?></textarea><br>
    <button type="submit">Update</button>
</form>




<?php require "end.php" ?>