<div>
    <h3> view counter :  </h3>
    <?php
        require_once "./functions.php";
        ajouter_une_vue();
        $vues = nb_vues();
    ?>
    il y a <?= $vues ?>  visite<?php if($vues > 1): ?>s<?php endif;?>
</div>