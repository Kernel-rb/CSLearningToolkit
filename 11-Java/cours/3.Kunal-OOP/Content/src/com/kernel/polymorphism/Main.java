package com.kernel.polymorphism;

/**
 * Polymorphism  =  many way to represent a single function, method, or operator
 * types of Polymorphism  :
 *      1 - Compile Time / Static polymorphism : is the ability to resolve method calls at compile time, usually through method overloading or operator overloading.
 *      **method overloading** : allows a class to have multiple methods with the same name but different parameters , return types , types ex : multiple constructors
 *      2 - Run Time / Dynamic polymorphism : his is typically achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass.
 *      **overriding**  : subclass provides a specific implementation of a method that is already defined in its superclass , the body is the only diff
 */
public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        triangle.area();

    }
}
