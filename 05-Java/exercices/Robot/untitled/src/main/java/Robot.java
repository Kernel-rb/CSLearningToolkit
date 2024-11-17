public class Robot {
    private  String nom;
    private int x , y ;
    private DIRECTION direction;

    public Robot(String nom , int x, int y , DIRECTION  direction  ){
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Robot(String nom){
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        this.direction = DIRECTION.EST;
    }


    public void avance(){
        switch(direction){
            case EST :
                x++;
                break;
            case SUD:
                y--;
                break;
            case NORD:
                y++;
                break;

            case Ouest:
                x--;
                break;
            default:
                break;
        }
    }

    public void droite(){
        if(direction == DIRECTION.NORD) {
            direction = DIRECTION.EST;
        } else if (direction == DIRECTION.EST) {
            direction = DIRECTION.SUD;
        } else if (direction == DIRECTION.SUD) {
            direction = DIRECTION.Ouest;
        }else {
            direction = DIRECTION.NORD;
        }
    }

    public void afficher(){
        System.out.println("Le nom du robot " + this.nom + "\n" + "les coordonnées : " +  this.x  + "  " + this.y  + "\n" + "direction" + this.direction);
    }

    public DIRECTION getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNom() {
        return nom;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setDirection(DIRECTION direction) {
        this.direction = direction;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
