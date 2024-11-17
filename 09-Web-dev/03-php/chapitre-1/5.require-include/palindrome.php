<?php

function isPalindrome($string){
    return strrev($string) === $string ? "O" : "N";
}
?>