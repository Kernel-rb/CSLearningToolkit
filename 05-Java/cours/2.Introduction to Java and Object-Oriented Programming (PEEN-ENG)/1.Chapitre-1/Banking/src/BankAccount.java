/**
 * Represent checking bank account for a  customer
 * @author Kernel-rb
 */
public class BankAccount {
    // Instances
    String accountType;
    double balance;
    Customer  customer;

    public  BankAccount(String accountType , Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
    }

    // methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if(amount > this.balance){
            throw new Exception("Amount >>>>>>>>>>> Balance");
        }
        this.balance -= amount;
    }

    public String getAccountInfo(){
        return "Type of the account : " + this.accountType +  "\n" +"Current Balance : " +  this.balance;
    }
    public String getCustomerInfo(){
        return  "Name : " + this.customer.getName() + " \n" + "Address : "+ this.customer.getAddress() + "\n" +  "PIN:"  + this.customer.getPin();
    }

}
