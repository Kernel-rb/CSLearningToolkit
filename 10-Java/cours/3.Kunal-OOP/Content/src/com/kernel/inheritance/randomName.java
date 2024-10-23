package com.kernel.inheritance;

public class randomName extends BoxOfBooks{
    int randomInt ;

    public randomName(){
        super();
        this.randomInt = -1 ;
    }

    public  randomName(double l  , double h , double w , int nbBoxes , int randomInt)
    {
        super(l , h , w  , nbBoxes);
        this.randomInt = randomInt;
    }

    public randomName(randomName other){
        super(other);
        this.randomInt = other.randomInt;
    }
}
