<?php
require_once "Model.php";

$m = Model::getModel();

if (!isset($_GET['id']) || (int)$_GET['id'] <= 0) {
    echo "There is no id in the URL.";
    exit;
}

$id = (int)$_GET['id'];

$nobel = $m->get_nobel_prize_informations($id);

if (!$nobel) {
    echo "There is no Nobel prize with such ID.";
    exit;
}

if ($m->remove_nobel_prize($id)) {
    echo "The Nobel prize has been removed.";
} else {
    echo "An error occurred while removing the Nobel prize.";
}
?>
