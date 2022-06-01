import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxMinTest {
    MaxMin m;
    @BeforeEach
    void setup() {
        m= new MaxMin();
    }

    @Test
    public void aLarger() {
        double a = 16.0;
        double b = 10.0;
        double expected = 16.0;
        double actual = m.maximum(a,b);
        assertTrue( actual>b, "should be larger");
        assertEquals(expected, actual);
    }
//    @Test
//    public void bLarger() {
//        double a = 10.0;
//        double b = 16.0;
//        double expected = 16.0;
//        double actual = m.maximum(a,b);
//        assertThat("b should be larger",b, greaterThan(a));
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void bothEqual() {
//        double a = 16.0;
//        double b = 16.0;
//        double expected = 16.0;
//        double actual = m.maximum(a,b);
//        assertEquals(a,b);
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void bothNegative() {
//        double a = -2.0;
//        double b = -1.0;
//        double expected = -1.0;
//        double actual = m.maximum(a,b);
//        assertTrue(actual<0, "should be negative");
//        assertEquals(expected, actual);
//    }




}
