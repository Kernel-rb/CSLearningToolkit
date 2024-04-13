import java.util.Scanner;

public class ageCheaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // header 
        System.out.println("------------------- Welcome to Age cheaker  -------------------");
        // body 
        System.out.print("What's your name : ");
        String name = scanner.nextLine();

        System.out.printf("Hy %s , how old are u : " , name);
        int age = scanner.nextInt();

        if(age > 18 ){
            System.out.printf("Your are welcome , %s" , name);
        }else if(age == 18){
            System.out.printf("You are just 18 , %s" , name);
        }else{
            System.out.printf("You are not allowed , %s  but you can try after %d years" , name , 18 - age);
        }
        scanner.close();
    }  
}
