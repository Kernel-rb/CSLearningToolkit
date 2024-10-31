import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print the message: ");
        int n = scanner.nextInt();
        System.out.print("Enter the message you want to print: ");
        String message = scanner.next();
        int i = 0;
        while (i < n) {
            System.out.println(message);
            i++;
        }
        // Do-while loop
        do {
            System.out.println(message);
            i++;
        } while (i < n);

        scanner.close();
    }
    
}
