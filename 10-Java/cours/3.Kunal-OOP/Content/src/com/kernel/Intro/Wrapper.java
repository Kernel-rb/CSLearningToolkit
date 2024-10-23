package com.kernel;

public class Wrapper {
    public static void main(String[] args) {

        /* Garbage collector :
        Jump e;
        for(int i = 0 ; i < 100000000 ; i++){
             e = new Jump(150);
        }
        */
        Jump a = new Jump(40);
        System.out.println(a);
    }
}


class Jump {
    int normalJump = 50;
    final int SUPER_JUMP = 5 ;
    final int dropDamage  = 125;
    Jump(int normalJump){
        this.normalJump = normalJump;
    }

    void SuperJump( int SUPER_JUMP  ){
        this.normalJump += SUPER_JUMP;
    }
    void drop( int dropDamage){
        this.normalJump -= dropDamage;
    }



    public String toString(){
        return "You can Jump " + this.normalJump;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed ");
    }
}
