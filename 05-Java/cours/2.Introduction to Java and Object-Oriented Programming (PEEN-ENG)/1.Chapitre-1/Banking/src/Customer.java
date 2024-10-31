/**
 * Represent a customer of  a bank
 * @author Kernel-rb
 */

public class Customer {
    // instance var
    String name;
    String address;
    int pin;

    // Constructor
    public Customer(String name, int pin) {
        this.name = name;
        this.pin = pin;

    }
    // method :
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return address;
    }

    public int getPin() {
        return this.pin;
    }
}
