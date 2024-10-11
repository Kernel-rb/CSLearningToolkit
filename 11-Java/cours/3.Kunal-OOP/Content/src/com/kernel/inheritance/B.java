package com.kernel.inheritance;

public class B extends Box{
    int b;

    public B(){
        super();
        this.b = -1;
    }
    public B(int b , double l  , double h , double w ){
        super(l , h, w);
        this.b = b;
    }

    public B(B b_minuscule){
        super(b_minuscule);
        this.b = b_minuscule.b;
    }
}
