package org.kernel;

import javax.print.Doc;

public abstract   interface Document {
    boolean estDisponible();
    void emprunter();
    void retourner();
}



public interface a extends Document {

}
