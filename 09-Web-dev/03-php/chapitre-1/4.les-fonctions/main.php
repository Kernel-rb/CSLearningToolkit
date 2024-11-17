<?php
// ---------------------------------
$input = readline("Enter a word: ");
$rev = strrev($input);
if(strtolower($input) === strtolower($rev)){
    echo "Palindrome";
}else{
    echo "ISNT A PALINDROME";
     // exit("fin programme);
}
//----------------------------
$notes = [15 , 14 ,19];
$noted_rev = array_reverse($notes);
$sorted_notes = sort($noted_rev);
print_r($noted_rev);
array_push($notes , 20);
echo array_sum($notes) / count($notes);
?>