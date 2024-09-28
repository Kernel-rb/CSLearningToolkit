package com.kernel;

public class Wrapper {
    public static void main(String[] args) {
     // Garbage collector
    Jump e;
    for(int i = 0 ; i < 100000000 ; i++){
         e = new Jump(150);
    }
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


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed ");
    }
}
