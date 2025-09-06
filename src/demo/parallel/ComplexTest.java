package demo.parallel;

import static org.junit.Assert.*;
import org.junit.Test;

public class ComplexTest {
    
    private static final double DELTA = 1e-10;
    
    @Test
    public void testDivide() {
        Complex a = new Complex(4, 2);
        Complex b = new Complex(2, 1);
        Complex result = a.divide(b);
        
        // (4 + 2i) / (2 + i) = (8 + 4 - 4 + 2i) / (4 + 1) = (4 + 2i) / 5
        assertEquals(2.0, result.re, DELTA);
        assertEquals(0.4, result.im, DELTA);
    }
    
    @Test
    public void testPower() {
        Complex a = new Complex(2, 1);
        Complex result = a.power(2);
        
        // (2 + i)^2 = 4 + 4i + i^2 = 3 + 4i
        assertEquals(3.0, result.re, DELTA);
        assertEquals(4.0, result.im, DELTA);
        
        a = new Complex(1, 1);
        result = a.power(3);
        
        // (1 + i)^3 = (1 + i)(1 - 2i) = 1 - 2i + i - 2i^2 = 2 - i
        assertEquals(2.0, result.re, DELTA);
        assertEquals(-1.0, result.im, DELTA);
    }
    
    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        assertEquals(25.0, a.lengthSQ(), DELTA);
    }
    
    @Test
    public void testPlus() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, 2);
        Complex result = a.plus(b);
        
        assertEquals(3.0, result.re, DELTA);
        assertEquals(5.0, result.im, DELTA);
    }
    
    @Test
    public void testTimes() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, 2);
        Complex result = a.times(b);
        
        // (2 + 3i)(1 + 2i) = 2 + 4i + 3i + 6i^2 = 2 + 7i - 6 = -4 + 7i
        assertEquals(-4.0, result.re, DELTA);
        assertEquals(7.0, result.im, DELTA);
    }
}