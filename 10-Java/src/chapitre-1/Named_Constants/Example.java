/**
 * Example.java by kernel.rb 
 * To count the cost of apples 
 */

package Named_Constants;

public class Example 
{
    public static void main(String[] args) 
    { 
        final int ONE_DOZEN = 12 ;
        int dozenOfApples = 3;
        double  costPerApple = 0.3;
        double totalCost = dozenOfApples * ONE_DOZEN * costPerApple;

        System.out.println("U have to pay " + totalCost + "$");
    } // end main
}// end class
