import java.util.ArrayList;

public class Customer {
    static final String COMPANY =  "GOOGLE";
    static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();


    static Counter COUNTER ;
    String name;
    String location;
    int ID;

    public  Customer(String name , String location){
        this.name = name;
        this.location = location;
        this.ID  = Customer.COUNTER.getCount();
        Customer.COUNTER.increment();
        Customer.CUSTOMERS.add(this);
    }

    public static void printAllCustomers(){
        System.out.println("All Customers : ");
        System.out.println("-----------------------");
        for(Customer c  : Customer.CUSTOMERS){
            System.out.println(c);
            System.out.println("-----------------------");
        }
        System.out.println("\n");
    }

    public boolean isEqual(Object obj){
      Customer   randomCustomer = (Customer) obj;
      if(this.name.equals(randomCustomer.name) && this.location.equals(randomCustomer.location)) return true;
      return false;
    }

    public String toString(){
        return "ID : " + this.ID + "\n" + "Name : "  + this.name  + "\n" + "Company  : " + COMPANY + "\n" + "Location : " + this.location;
    }

    public static int findCustomer(Customer customer){
        int idx = -1;
        for(int i = 0 ; i < Customer.CUSTOMERS.size() ; i++){
            if(Customer.CUSTOMERS.get(i).equals(customer)){
                idx = i;
                break;
            }
        }
        return idx;
    }

    public  static void  removeCustomer(Customer customer){
        int goodbye = Customer.findCustomer(customer);
        if( goodbye >= 0 ){
            Customer.CUSTOMERS.remove(goodbye);
        }
    }
    public static void main(String[] args){
        Customer.COUNTER = new Counter(1);
        Customer c1 = new Customer("Kernel" , "Paris");
        Customer c2 = new Customer("Leanardo" , "Tiznit");

        Customer.printAllCustomers();
        Customer c3 = new Customer("Gabriel" , "San Diego");
        Customer.printAllCustomers();

        // remove Customer

        Customer.removeCustomer(c3);
        printAllCustomers();

        // find Customer
        Customer.findCustomer(c2);
    }
}
