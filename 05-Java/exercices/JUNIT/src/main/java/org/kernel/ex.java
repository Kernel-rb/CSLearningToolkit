package org.kernel;

import java.util.Scanner;

public class ex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        try {
            System.out.println(a /b);
        }catch(ArithmeticException e){
            System.out.println("il faut que le dominateur soit diff de 0 ");
        }
    }

}
