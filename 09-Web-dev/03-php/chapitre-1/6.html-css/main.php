<?php
$title = "home page"; 
require "header.php";
?>
<pre> 
    <h5> Info du server  : </h5>
    <!-- <pre> en HTML est utilisée pour afficher du texte exactement comme il est écrit -->
    <?php print_r($_SERVER); ?> 
</pre>
<main>
    <h2>Notre contenu principal</h2>
    <p>Le contenu principal de la page peut inclure des informations, des images, des liens, ou d'autres éléments.</p>
</main>

<style>
    main {
        padding: 20px;
        background-color: white;
        margin-top: 20px;
    }
</style>

<?php require "footer.php" ?>
