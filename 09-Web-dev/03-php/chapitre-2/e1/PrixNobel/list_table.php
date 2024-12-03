<?php
require_once "Model.php";
require_once "begin.html";

$m = Model::getModel();
$r = $m->get_last();

function display_data($r) : void {
    foreach ($r as $v) {
        echo "<tr>
                <td><a href='informations.php?id={$v['id']}'>" . htmlspecialchars($v['name']) . "</a></td>
                <td>" . htmlspecialchars($v['category']) . "</td>
                <td>" . htmlspecialchars($v['year']) . "</td>
                <td class='sansBordure'>
                    <a href='remove.php?id={$v['id']}'>
                        <img src='Content/img/remove-icon.png' class='icone' alt='Remove'>
                    </a>
                </td>
                <td class='sansBordure'>
                    <a href='form_update.php?id={$v['id']}'>
                        <img src='Content/img/edit-icon.png' class='icone' alt='Edit'>
                    </a>
                </td>
              </tr>";
    }
}
?>

<body> 
    <h1>List of the last 25 Nobel prizes:</h1>
    <table border='1'>
        <tr>
            <th>Name</th>
            <th>Category</th>
            <th>Year</th>
            <th>Actions</th>
        </tr>
        <?php display_data($r); ?>      
    </table>
</body>
