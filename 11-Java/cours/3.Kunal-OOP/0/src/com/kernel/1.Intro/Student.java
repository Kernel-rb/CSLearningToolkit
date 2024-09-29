package com.kernel;

import java.util.Scanner;

public class Student {


     int id;
     String name;
     double marks;


      Student(int id  , String name , double marks){
        this.id = id;
        this.name = name;
        this.marks =  marks;
      }

    Student(){
          this(0 , "default values " , 0 );
    }

    String changeID(){
          System.out.println("Change ID :  ");
          Scanner scanner = new Scanner(System.in);
          this.id = scanner.nextInt();
          return "ID changed :)";
    }
    String changeName(){
        System.out.println("Change Name :  ");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        return "Name changed :)";
    }
    String changeMark(){
        System.out.println("Change MARK :  ");
        Scanner scanner = new Scanner(System.in);
        this.marks = scanner.nextDouble();
        return "MARK changed :)";
    }

}
