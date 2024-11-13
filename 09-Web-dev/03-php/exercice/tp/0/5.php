<?php
$personnes = [
    'mdupond' => ['Prénom' => 'Martin', 'Nom' => 'Dupond', 'Age' => 25, 'Ville' => 'Paris'       ],
    'jm'      => ['Prénom' => 'Jean'  , 'Nom' => 'Martin', 'Age' => 20, 'Ville' => 'Villetaneuse'],
    'toto'    => ['Prénom' => 'Tom'   , 'Nom' => 'Tonge' , 'Age' => 18, 'Ville' => 'Epinay'      ],
    'arn'     => ['Prénom' => 'Arnaud', 'Nom' => 'Dupond', 'Age' => 33, 'Ville' => 'Paris'       ],
    'email'   => ['Prénom' => 'Emilie', 'Nom' => 'Ailta' , 'Age' => 46, 'Ville' => 'Villetaneuse'],
    'dask'    => ['Prénom' => 'Damien', 'Nom' => 'Askier', 'Age' => 7 , 'Ville' => 'Villetaneuse']
];

// echo  $personnes["arn"]["Age"];
// echo  $personnes["toto"]["Ville"];
// echo  $personnes["dask"];


function array_to_table($arr){
    $table = "<tr>";

    foreach(array_keys(reset($arr)) as $header){
        $table .= "<th>$header</th>";
    }
    $table .= "</tr>\n";

    foreach($arr as $valuer){
        $table .= "<tr>";
        foreach($valuer as $v){
            $table .= "<td>$v</td>";
        };
        $table .= "</tr> \n";
    }
    return $table;
}


$scores = [
    ['Joueur' => 'Camille'  , 'score' => 156 ],
    ['Joueur' => 'Guillaume', 'score' => 254 ],
    ['Joueur' => 'Julien'   , 'score' => 192 ],
    ['Joueur' => 'Nabila'   , 'score' => 317 ],
    ['Joueur' => 'Lorianne' , 'score' => 235 ],
    ['Joueur' => 'Tom'      , 'score' => 83  ],
    ['Joueur' => 'Michael'  , 'score' => 325 ],
    ['Joueur' => 'Eddy'     , 'score' => 299 ]
]
  

?>

<table border="1">
    <?=array_to_table($scores);?>
</table>
