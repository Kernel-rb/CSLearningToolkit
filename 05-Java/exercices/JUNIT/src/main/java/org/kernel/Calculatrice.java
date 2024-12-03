package org.kernel;

public class Calculatrice {
    private final MathService mathService;

    public Calculatrice(MathService mathService) {
        this.mathService = mathService;
    }

    public int multiplierParDeux(int nombre) {
        return mathService.multiply(nombre, 2);
    }
}

