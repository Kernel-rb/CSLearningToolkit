<?php

require_once "../PrixNobel/Model.php";

$m = Model::getModel();
$r = $m->get_browser();




echo "<li> {$v["nom"]}    {$v["zv"]} </li> ";


?>