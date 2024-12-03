<?php
class Model {
    private $bd;
    private static $instance = null;

    public function __construct() 
    {
        require "../nbpn.php";
        $this->bd = $bd;
    }

    public static function getModel(){
        if(self::$instance ===  null) {
            self::$instance = new self();
        }

        return self::$instance;
    }

    public function get_last() {
        $req = $this->bd->prepare("SELECT * FROM nobels ORDER BY year DESC LIMIT 25");
        $req->execute();
        return $req->fetchAll(PDO::FETCH_ASSOC);

    }

    public function get_nobel_prizes() {
        try {
            $req = $this->bd->prepare("SELECT COUNT(*) FROM nobels");
            $req->execute();
            $nb = $req->fetchColumn();
            return $nb;
        } catch (PDOException $e) {
          die('Erreur SQL : ' . $e->getMessage());
        }
    }


    public function get_nobel_prize_informations($id){
        if($id >  0){
            $req = $this->bd->prepare("select *  from nobels where id = :id");
            $req->bindValue(':id' , $id ,PDO::PARAM_INT);
            $req->execute();
            return $req->fetch(PDO::FETCH_ASSOC);
        }else{
            return false;
        }
    }


    public function get_categories(){
        $req= $this->bd->prepare("SELECT DISTINCT category FROM nobels");
        $req->execute();
        $r = $req->fetchAll(PDO::FETCH_ASSOC);
        $arr = [];
        foreach($r as $v){
            $arr[] =  $v['category'];
        }
        return $arr;
    }




    public function add_nobel_prize($infos) {
        $req = $this->bd->prepare("INSERT INTO nobels (year, category, name, birthdate, birthplace, county, motivation) 
        VALUES (:year, :category, :name, :birthdate, :birthplace, :county, :motivation)");
        $req->bindValue(':year', $infos['year'], PDO::PARAM_INT);
        $req->bindValue(':category', $infos['category'], PDO::PARAM_STR);
        $req->bindValue(':name', $infos['name'], PDO::PARAM_STR);
        $req->bindValue(':birthdate', $infos['birthdate'], PDO::PARAM_STR);
        $req->bindValue(':birthplace', $infos['birthplace'], PDO::PARAM_STR);
        $req->bindValue(':county', $infos['county'], PDO::PARAM_STR);
        $req->bindValue(':motivation', $infos['motivation'], PDO::PARAM_STR);
        return $req->execute();
    }

    public function remove_nobel_prize($id) {
        $req = $this->bd->prepare("DELETE FROM nobels WHERE id = :id");
        $req->bindValue(':id', $id, PDO::PARAM_INT);
        return $req->execute();
    }

    public function updateNobelPrize($infos) {
        $req = $this->bd->prepare("UPDATE nobels SET year = :year category = :category , name = :name , birthdate = :birthdate, birthplace = :birthplace, county = :county, motivation = :motivation WHERE id = :id");
        
        $req->bindValue(':id', $infos['id'], PDO::PARAM_INT);
        $req->bindValue(':year', $infos['year'], PDO::PARAM_INT);
        $req->bindValue(':category', $infos['category'], PDO::PARAM_STR);
        $req->bindValue(':name', $infos['name'], PDO::PARAM_STR);
        $req->bindValue(':birthdate', $infos['birthdate'], PDO::PARAM_STR);
        $req->bindValue(':birthplace', $infos['birthplace'], PDO::PARAM_STR);
        $req->bindValue(':county', $infos['county'], PDO::PARAM_STR);
        $req->bindValue(':motivation', $infos['motivation'], PDO::PARAM_STR);
        
        return $req->execute();
    }

    public function get_nobel_prizes_with_limit($offset, $limit) {
        $sql = "SELECT * FROM nobels 
                ORDER BY year DESC 
                LIMIT :limit OFFSET :offset";
    
        $req = $this->bd->prepare($sql);
        $req->bindValue(':limit', $limit, PDO::PARAM_INT);
        $req->bindValue(':offset', $offset, PDO::PARAM_INT);
        $req->execute();
        
        return $req->fetchAll(PDO::FETCH_ASSOC);
    }


}
?>
