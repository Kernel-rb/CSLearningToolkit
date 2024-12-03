<?php
class HomeController  {
    public function home() {
        $nb_nobels = (new Model())->getNbNobelPrizes(); // Adaptez en fonction de la méthode pour récupérer le nombre.
        include 'Views/home.php';
    }
}
?>
