package com.kernel.Static;

public class Human {
    int     age;
    String  name;
    double  height ;
    boolean StudentOrNot;
    static  long  population;
    public  Human( int age , String name , double height , boolean StudentOrNot){
        this.age =   age;
        this.name =  name;
        this.height = height;
        this.StudentOrNot = StudentOrNot;
        Human.population++;
    }
    static void talk(){
        System.out.println(" ehm ehm .... ");
    }
}