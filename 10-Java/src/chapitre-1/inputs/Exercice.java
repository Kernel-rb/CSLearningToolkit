package inputs;
import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a circle raduis : ");
        int circleRaduis = keyboard.nextInt();
        System.out.println("The circle raduis entred : " + circleRaduis);
    }
}
