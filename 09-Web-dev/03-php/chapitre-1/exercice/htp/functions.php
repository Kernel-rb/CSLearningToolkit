<?php 
function ajouter_une_vue() {
    $file_path = dirname(__DIR__) . DIRECTORY_SEPARATOR . "htp" . DIRECTORY_SEPARATOR. "data" . DIRECTORY_SEPARATOR . "counter.txt";
    
    if (file_exists($file_path)) {
        $counter = (int)file_get_contents($file_path);
    } else {
        $counter = 1;
    }

    $counter++;
    file_put_contents($file_path, $counter);
}

function nb_vues():string {
    $file_path = dirname(__DIR__) . DIRECTORY_SEPARATOR . "htp" . DIRECTORY_SEPARATOR. "data" . DIRECTORY_SEPARATOR . "counter.txt";
    return file_get_contents($file_path);
}
?>