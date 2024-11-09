<?php

function checkbox(string $name , string $val , array $data) : string
{
    $attributs = "";
    if(isset($data["$name"]) && in_array($val , $data[$name])) $attributs .= "checked";
    return <<<HTML
    <input type="checkbox" name="{$name}[]" value="$val" $attributs>  
    HTML;
}



function radio(string $name , string $val , array $data) : string
{
    $attributs = "";
    if(isset($data["$name"]) && in_array($val , $data[$name])) $attributs .= "checked";
    return <<<HTML
    <input type="radio" name="{$name}[]" value="$val" $attributs>  
    HTML;
}



?>