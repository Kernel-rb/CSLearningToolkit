import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print the message: ");
        int n = scanner.nextInt();
        System.out.print("Enter the message you want to print: ");
        String message = scanner.next();
        for (int i = 0; i < n; i++) {
            System.out.println(message);

        }
        scanner.close();
    }
}
