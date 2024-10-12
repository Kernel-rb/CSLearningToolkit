public class Main {
    /**
     * public access = class + package + subclass ( diff & same pkg) + world
     * protected access = class + package + subclass diff & same package
     * no modifier access = class + package  + subclass same package
     * private access = class
     */

    public static void main(String[] args) {
        A obj = new A(10, "Kernel");
    }
}
