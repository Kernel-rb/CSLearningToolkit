package org.kernel;

import java.util.Scanner;

public class PolyException {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        try {
            int a = s.nextInt();
            int b = s.nextInt();
            if( b == 0 ){
                throw  new Exception("B diff de 0");
            }
        } catch (Exception e) {
            throw new Exception("PLs enter an integer ");
        }

    }

}
