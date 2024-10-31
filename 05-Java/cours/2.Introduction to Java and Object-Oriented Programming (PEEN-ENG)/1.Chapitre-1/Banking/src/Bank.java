import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts
 * @author Kernel-rb
 */
public class Bank {
    public  static  void  main(String[] args)
    {
        // Create an instance of Bank Class
        Bank bank = new Bank();
        // Calls the run method in Bank Class
        bank.run();
    }

    /**
     * Runs the program
     */
    public void run()
    {
        System.out.println("Welcome to the bank :");
        System.out.println("What is your Name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Pls enter a secret code : ");
        int pin = scanner.nextInt();
        System.out.println("Your code is : " + pin);
        Customer customer  = new Customer(name , pin);
        System.out.println("What is Your address : ");
        Scanner scanner1 = new Scanner(System.in);
        String address = scanner1.nextLine();
        customer.setAddress(address);

        // Check-in Account
        BankAccount checkingAccount = new BankAccount("check-in" , customer);
        // Saving Account
        BankAccount savingAccount = new BankAccount("save-in" , customer);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Customer Info : ");
        System.out.println(checkingAccount.getCustomerInfo());

        // get and print account info :
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Checking  Info : ");
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Saving  Info : ");
        System.out.println(savingAccount.getAccountInfo());


        // Deposit
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("How much money u wanna deposit to check-in account  : ");
        Scanner bl_scanner = new Scanner(System.in);
        double amount  = bl_scanner.nextDouble();
        checkingAccount.deposit(amount);
        System.out.println("You successful deposit  : " + amount);
        System.out.println("Your current balance is : " + checkingAccount.balance);
        // Deposit
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("How much money u wanna deposit to saving account  : ");
        double saving_amount  = bl_scanner.nextDouble();
        savingAccount.deposit(saving_amount);
        System.out.println("You successful deposit  : " + amount);
        System.out.println("Your current balance is : " + savingAccount.balance);
    }
}
