import java.util.Scanner;

public class userInputs {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine(); 

            System.out.printf("Hello %s , how old are you ?" , name);
            int age = scanner.nextInt(); // int  + <enter> 

            scanner.nextLine(); // !clean input buffer

            System.out.printf("Hello %s , What is your favorite language ?" , name);
            String language = scanner.nextLine();

            System.out.printf("Name : %s , Age : %d , language : %s"  , name , age  , language);

            scanner.close();

    }
}
