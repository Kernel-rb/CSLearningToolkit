package org.kernel;

public class Bank {
    float solde;

    public  Bank(float solde){
        this.solde = solde;
    }
    public void deposer(float m){
        this.solde += m;
    }

    public void retirer(float m) throws Exception {
        if(m > solde){
            throw  new Exception("m >> solde");
        }
        System.out.println("Vous avez retiré 100$");
    }
}
