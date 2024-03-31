package inputs;
import java.util.Scanner;

/** ProblemSolved.java by kernel.rb
 
   Computes the money saved by buying a box of apples 
   at the box rate instead of the individual rate.
 
   Input:  Number of apples per box
           Cost of one apple
           Cost of box of apples
 
   Output: The input data
           The cost of apples if bought separately
           The savings if bought by the box
*/
public class ApplesByTheBox {
    public static void main(String[] args) {
        // Welcome messahe
        System.out.println("Welcom To  Apple By the Box ");
        // get the input form the keyboard
        Scanner keyboard =  new Scanner(System.in);
        // the numner of apple in the box 
        System.out.print("Enter the number of apples in the box : ");
        int numberOfApplesInTheBox = keyboard.nextInt();

        // the price of one apple 
        System.out.print("Enter the price of one apple : ");
        double priceOfAnApple  = keyboard.nextDouble();

        // the price of a box of applr 
        System.out.print("Enter the price of a box of apples : ");
        double priceOfBoxOfApple = keyboard.nextDouble();
        
        // the price without buying a box 
        double priceWhitoutBuyingBox = numberOfApplesInTheBox * priceOfAnApple;
        System.out.println("the price of apples outside of the box "  + priceWhitoutBuyingBox + "$");

        // display the difference  
        double diff = priceOfBoxOfApple - priceWhitoutBuyingBox;
        System.out.println("the difference is " +  diff + "$");
    }
    
}

