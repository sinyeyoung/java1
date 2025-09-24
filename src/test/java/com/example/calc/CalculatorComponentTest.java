package com.example.calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorComponentTest {
    private final Calculator c = new Calculator();

    @Test public void add_twoPositives_returnsSum(){ assertEquals(9, c.add(4,5)); }
    @Test public void add_withZero_returnsSameNumber(){ assertEquals(7, c.add(7,0)); }
    @Test public void add_withNegative_returnsCorrectSum(){ assertEquals(-1, c.add(2,-3)); }
    @Test public void subtract_twoNumbers_returnsDifference(){ assertEquals(2, c.subtract(5,3)); }
    @Test public void subtract_biggerSecond_makesNegative(){ assertEquals(-4, c.subtract(3,7)); }
    @Test public void multiply_withZero_returnsZero(){ assertEquals(0, c.multiply(123,0)); }
    @Test public void multiply_withNegative_signIsCorrect(){ assertEquals(-12, c.multiply(3,-4)); }
    @Test public void divide_twoNumbers_returnsQuotient(){ assertEquals(2, c.divide(6,3)); }
    @Test public void divide_truncatesTowardZero(){ assertEquals(2, c.divide(5,2)); }
    @Test(expected=IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIAE(){ c.divide(5,0); }
}
