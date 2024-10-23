import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    Counter counter;

    @BeforeEach
    void setup() throws Exception {
        this.counter = new Counter();
    }

    @Test
    public void testIncrement() {
        assertEquals(1, this.counter.increment());
        assertEquals(2, this.counter.increment());
        this.counter.increment();
        assertNotEquals(2, this.counter.getCounter(), "Return not valid");
        assertEquals(3, this.counter.getCounter());
        assertNotEquals(3, this.counter.increment());
    }

    @Test
    public void testDecrement() {
        assertEquals(-1, this.counter.decrement());
        assertEquals(-2, this.counter.decrement());
        this.counter.decrement();
        assertNotEquals(-2, this.counter.getCounter(), "Return incorrect");
    }
}
