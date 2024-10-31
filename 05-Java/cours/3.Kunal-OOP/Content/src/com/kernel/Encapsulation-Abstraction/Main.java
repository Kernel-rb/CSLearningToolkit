import java.util.ArrayList;

/**
 * Encapsulation is hiding the internal details of an object and only showing what is necessary, usually through public methods.
 * Abstraction is the concept of hiding complex details and showing only the essential features of an object, simplifying the interface and making it easier to use.
 * Encapsulation != Abstraction
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(); // we don't care about how it works => Abstraction
        System.out.println("h");

        // Encapsulation
        P me = new P(5);
        System.out.println(me.getAge());
        me.setAge(8);
        System.out.println(me.getAge());
    }
}
