import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number 1
        System.out.print("Enter to first number : ");
        int n1 = scanner.nextInt();
        // Number 2 
        System.out.printf("Your first number was : %d , now enter the second one : " , n1);
        int n2 = scanner.nextInt();
        scanner.nextLine();
        // Confirm 
        System.out.printf("n1 : %d  &&  n2 : %d \n", n1 , n2);

        // Ops 
        System.out.print("What ops do you zant to perform ?");
        String operation = scanner.nextLine();

        // switch-case
        switch(operation){
            case "+":
            System.out.printf("Result : %d" , n1 + n2);
            break;
            case "-":
            System.out.printf("Result : %d" , n1 - n2);
            break;
            case "*":
            System.out.printf("Result : %d" , n1 * n2);
            break;
            case "/":
            if (n2 == 0){
                System.out.println("Division by zero is not allowed");
            }else{
                System.out.printf("Result : %d" , n1 / n2);
            }
            break;
            default:
            System.out.println("Invalid operation");
        }
        scanner.close();
    }
}
