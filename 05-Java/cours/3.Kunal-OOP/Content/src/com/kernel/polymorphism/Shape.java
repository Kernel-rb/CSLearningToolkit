package com.kernel.polymorphism;

public class Shape {
    // Cannot override a final method
    void area() {
        System.out.println("Area of shape");
    }

    static void greeting(){
        System.out.println("Cannot overriding  , but  can be inherited  ");
    }

}
