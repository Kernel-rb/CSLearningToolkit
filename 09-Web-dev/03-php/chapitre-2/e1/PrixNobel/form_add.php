<?php
require_once "Model.php";
require_once "begin.html";

$m = Model::getModel();
$categories = $m->get_categories(); 
?>

<form action="" method="post"> 
    <label>Name:</label>
    <input type="text" name="name" required/><br/>

    <label>Year:</label>
    <input type="number" name="year" required/><br/>

    <label>Birth Date:</label>
    <input type="date" name="birth_date" required/><br/>

    <label>Birth Place:</label>
    <input type="text" name="birth_place" required/><br/>

    <label>Country:</label>
    <input type="text" name="country" required/><br/>

    <label>Category:</label>
    <select name="category" required>
        <?php
        foreach ($categories as $category) {
            echo "<option value='" . htmlspecialchars($category) . "'>" . htmlspecialchars($category) . "</option>";
        }
        ?>
    </select><br/>

    <label>Motivation:</label>
    <input type="text" name="motivation" required/><br/>

    <button type="submit">Add in database</button>
</form>

<?php require "end.html"; ?>
