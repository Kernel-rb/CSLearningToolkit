package com.kernel.Static;

public class Initstatic {
    static int a = 4 ;
    static int b;

    // run once, when the first obj is created
    static {
        b = a * 8;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
    }
}
