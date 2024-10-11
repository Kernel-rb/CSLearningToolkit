package com.kernel.Static;

public class Main {
    public static void main(String[] args) {
        Human Alex = new Human(19 , "Alex" , 1.90 , true);
        Human Leo = new Human(39 , "Leo" , 1.90 , false);

        System.out.println(Human.population);
        greeting();
    }
    // non-static belong to an Obj
    static void greeting(){
        System.out.println("Hello !!! ");
        Bye();
    }
    static void Bye(){
        System.out.println("GoodBye  !!! ");
        Main obj = new Main();
        obj.aName();
    }

    void aName(){
        greeting();
    }
}
