package com.kernel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student kernel = new Student(1 , "kernel" , 45.3);
        Student memoryAllocation = kernel;
        Student defaultOne = new Student();
        System.out.println(kernel.changeID());
        System.out.println(kernel.changeName());
        System.out.println(kernel.changeMark());
        System.out.println(kernel.id  + "\n" +   kernel.name +  "\n" +  kernel.marks);
        System.out.println();
        System.out.println(defaultOne.id  + "\n" +   defaultOne.name +  "\n" +  defaultOne.marks);
        System.out.println(memoryAllocation.id  + "\n" +   memoryAllocation.name +  "\n" +  memoryAllocation.marks);

    }
}
