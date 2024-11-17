<?php
function create($lower , $upper , $mul):string{
    $r0 = "";
    for($i = $lower ; $i <= $upper  ;$i++ ){
        $r  = $mul * $i;
        $r0  .= "<tr><td>$i</td><td>$r</td></tr>";
    };
    return $r0;
}
?>

<table>
    <tr>
        <th>mult</th>
        <th>7</th>
    </tr>

    <?= create(1 , 10 , 7 ); ?>
    
</table> 