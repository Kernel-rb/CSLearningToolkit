package com.kernel.inheritance;

public class BoxOfBooks extends  Box {
    int nbBoxes;


    public BoxOfBooks(){
        super();
        this.nbBoxes = -1;
    }
    public BoxOfBooks(double l  , double h , double w , int nbBoxes){
        super(l , h ,w); // init val -> parent class
        this.nbBoxes = nbBoxes;
    }
    public BoxOfBooks(BoxOfBooks other){
        super(other);
        this.nbBoxes = other.nbBoxes;
    }
}
