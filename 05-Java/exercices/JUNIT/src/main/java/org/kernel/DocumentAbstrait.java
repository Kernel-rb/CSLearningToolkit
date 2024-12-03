package org.kernel;

public   class  DocumentAbstrait  implements  Document {
    boolean d;
    public  DocumentAbstrait(){
        this.d = true;
    }
    @Override
    public av boolean estDisponible(){
        return  d;
    }

    @Override
    public void emprunter(){
        d = false;
    }

    @Override
    public void retourner(){
        d = true;
    }
}
