<?php
require_once "Model.php";

$page = isset($_GET['page']) && (int)$_GET['page'] > 0 ? (int)$_GET['page'] : 1;
$limit = 25;
$offset = ($page - 1) * $limit;

$m = Model::getModel();

$totalPrizes = $m->get_nobel_prizes();
$nobelPrizes = $m->get_nobel_prizes_with_limit($offset, $limit);

if (!$nobelPrizes) {
    echo "No Nobel prizes found.";
    exit;
}

$totalPages = ceil($totalPrizes / $limit);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Nobel Prizes</title>
</head>
<body>
    <h1>All Nobel Prizes</h1>
    <?php include 'list_table.php'; ?>
    <div>
        <?php if ($page > 1): ?>
            <a href="list_all.php?page=<?= $page - 1 ?>">Previous</a>
        <?php endif; ?>

        <?php for ($i = 1; $i <= $totalPages; $i++): ?>
            <?php if ($i == $page): ?>
                <strong><?= $i ?></strong>
            <?php else: ?>
                <a href="list_all.php?page=<?= $i ?>"><?= $i ?></a>
            <?php endif; ?>
        <?php endfor; ?>

        <?php if ($page < $totalPages): ?>
            <a href="list_all.php?page=<?= $page + 1 ?>">Next</a>
        <?php endif; ?>
    </div>
</body>
</html>
