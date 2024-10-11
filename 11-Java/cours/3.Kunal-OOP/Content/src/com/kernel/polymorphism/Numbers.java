package com.kernel.polymorphism;

// Overloading  :
public class Numbers {
    int  sum(int a , int b){
        return a + b ;
    }
    int sum(int a , int b , int c) {
        return a  + b + c;
    }

    double sum(int a , double b){
        return a + b;
    }

    public static void main(String[] args) {
        Numbers t = new Numbers();
        t.sum(1,3);
        t.sum(3 , 4.012);
        t.sum(4,9,80);
    }
}
