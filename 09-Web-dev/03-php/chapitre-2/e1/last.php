<?php 

require "nbpn.php";
$req = $bd->prepare( "SELECT * FROM nobels ORDER BY year DESC LIMIT 25");
$req->execute();

$table = $req->fetch(PDO::FETCH_ASSOC);

echo "<table border='1'>
        <tr>
            <th> Nom et prenom </th>
            <th> Categorie </th>
            <th> Year </th>
        </tr>";


while($table){
    echo "<tr>
            <td>{$table['name']} </td>
            <td>{$table['category']} </td>
            <td>{$table['year']}</td>
        </tr>";
}




foreach( $table as $v)
{
    echo "<tr>
            <td>{$v['name']}</td>
            <td>{$v['category']}</td>
            <td>{$v['year']}</td>
        </tr>";
};
echo "</table>";


?>
