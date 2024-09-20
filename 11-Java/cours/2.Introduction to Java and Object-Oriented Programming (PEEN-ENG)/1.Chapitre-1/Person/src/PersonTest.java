import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void testPerson() {
        Person jackMick = new Person("Kernel", 22, 45.6);
        Person jackMPA = new Person("Kernel", 22, 45.6);
        assertEquals(jackMPA.name , jackMick.name , "OY OY");
        assertSame(jackMPA , jackMick , "OHH NO");
    }
}
