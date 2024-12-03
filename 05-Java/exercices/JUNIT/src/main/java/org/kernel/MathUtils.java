package org.kernel;

import java.util.Collections;
import java.util.List;

public class MathUtils {

    public int a(int a , int b){
        return a + b;
    }
    public int diviser(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Le diviseur ne peut pas être 0 !");
        }
        return a / b;
    }

    public List<Integer> trierListe(List<Integer> liste) {
        Collections.sort(liste);
        return liste;
    }
}
