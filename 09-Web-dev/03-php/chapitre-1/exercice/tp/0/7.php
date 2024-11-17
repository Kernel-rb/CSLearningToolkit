<?php
class TODO {
    private $todo = [];

    public function add_to_do($t){
        if(!empty($t)){
            $this->todo[] = $t;
        }
    }

    public function remove($i){
        if(isset($this->todo[$i])){
            unset($this->todo[$i]);
        }
    }

    public function is_empty(){
        return empty($this->todo);
    }


    public function get_html(){
        if($this->is_empty()){
            return "<p> Aucune Tache A faire";
        }

        $l = "<ul>";
        foreach($this->todo as $t){
            $l .= "<li>".htmlentities($t)."</ul>";
        }
        $l .= "</ul>";
        return $l;
    }
}

?>