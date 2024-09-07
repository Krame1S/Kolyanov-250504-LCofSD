package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    @Test
    public void testAddition() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        a.plus(b);
        assertEquals(3, a.getRe());
        assertEquals(3, a.getIm());
    }
}
