package org.kernel;

public class TropPetitException  extends  Exception {
    public static boolean verifierNb(int n) throws  Exception
    {
        if(n < 10) return true;
        throw new Exception("le nb > 10 ");
    }


    public static void main(String[] args) {
        try {
            System.out.println(verifierNb(0));
        }catch (Exception e ){
            System.out.println(e);
        }
    }

}
