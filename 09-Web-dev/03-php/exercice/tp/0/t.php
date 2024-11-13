

<?php

// Quelles sont les clés du tableau ? Quelles sont les valeurs ?
$personnes = [
    'mdupond' => ['Prénom' => 'Martin', 'Nom' => 'Dupond', 'Age' => 25, 'Ville' => 'Paris'       ],
    'jm'      => ['Prénom' => 'Jean'  , 'Nom' => 'Martin', 'Age' => 20, 'Ville' => 'Villetaneuse'],
    'toto'    => ['Prénom' => 'Tom'   , 'Nom' => 'Tonge' , 'Age' => 18, 'Ville' => 'Epinay'      ],
    'arn'     => ['Prénom' => 'Arnaud', 'Nom' => 'Dupond', 'Age' => 33, 'Ville' => 'Paris'       ],
    'email'   => ['Prénom' => 'Emilie', 'Nom' => 'Ailta' , 'Age' => 46, 'Ville' => 'Villetaneuse'],
    'dask'    => ['Prénom' => 'Damien', 'Nom' => 'Askier', 'Age' => 7 , 'Ville' => 'Villetaneuse']
];
/*
function d($arr){
    $html ="<table border=1 >";
    foreach($arr as $k => $v){
        $html .= "<tr>";
        foreach($v as $k1 => $v1){
            $html .= "<th>".$k1."</th>";
            $html .= "<td>".$v1."</td>";
        }
        $html .= "</tr>";
    }
    $html .= "</table>";
    return $html;
}
*/

$arr = [
    'le monde'              => ['frequence' => 'quotidien', 'type' => 'actualité', 'prix' => 220],
    'le point'              => ['frequence' => 'hebdo'    , 'type' => 'actualité', 'prix' => 80 ],
    'causette'              => ['frequence' => 'mensuel'  , 'type' => 'féminin'  , 'prix' => 180],
    'politis'               => ['frequence' => 'hebdo'    , 'type' => 'opinion'  , 'prix' => 100],
    'le monde diplomatique' => ['frequence' => 'mensuel'  , 'type' => 'analyse'  , 'prix' => 60 ],
    'libération'            => ['frequence' => 'quotidien', 'type' => 'actualité', 'prix' => 190],
];
  
$tabMagazinesAbonne = ['le monde', 'le monde diplomatique'];

// $k = array_keys($tabMagazines);
// sort($k);
// echo implode(", " , $k);

// function display($arr){
//     $html = "<ol><li>";
//     foreach(array_keys($arr) as $k){
//         $html .= $k."(";
//         foreach($arr as $k1 => $v1){
//             foreach($v1 as $v2){
//                 $html.= $v2.") <br><li>";
//             }
//         }
//     } 
//     html .= "<li"

// }


class TODO{
   private $t = [];

   public function add_to_do($s){
    if(!empty($s)){
        $t[] = $s;
    }
    return null;
   }

   public function remove_to_do($i){
    unset($t[$i]);
   }

   public function  ie($tache){
    if(empty($tache)){
        return true;
    }else{
        return false;
    }
   }

   public function getHTML():string{
    if(ie($tache)){
        
    }
   }

}
  
?>


