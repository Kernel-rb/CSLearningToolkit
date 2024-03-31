package Quiz;
import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");

        System.out.println("What is your hometown? ");
  
  
        System.out.println("When is your birthday? "); 


        String name = keyboard.next();
        String hometown = keyboard.next();
        String birthday = keyboard.next();


        System.out.println("my name is" + name );
        System.out.println("i'm from : " +  hometown);
        System.out.println("My birthday is : " +  birthday);
    
    }
}


