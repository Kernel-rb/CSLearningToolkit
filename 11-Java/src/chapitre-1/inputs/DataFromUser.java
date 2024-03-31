// data from the user DataFromUser.java by kernel.rb
package inputs;
import java.util.Scanner; 
// for other Package u can check this : https://docs.oracle.com/javase/8/docs/api/
public class DataFromUser 
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // read data from the keyboard 
        System.out.println("Pls Enter your age and your score  ");
        int age = keyboard.nextInt();
        int score = keyboard.nextInt();
        
        System.out.println("Your age is : " + age + "\n" +  "u scored : " + score) ;
    }
    
}
;