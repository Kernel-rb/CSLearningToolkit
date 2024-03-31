package Declaration_Assignements;

/**
 * Apples.java  by kernel rb 
 * Computes the cost of a number of apples 
 */

public class Apples 
{ // begin the class

    public static void main(String[] args) 
    { // begin the method 
        // declaration 
        int numberOfApples;
        double priceOfApples , totalCost;
        
        // Assignement 
        numberOfApples = 10;
        priceOfApples = 0.3;
        totalCost = numberOfApples * priceOfApples ;

        // prints 
        System.out.println(totalCost + "$");

    } // end of the method
}// end the class