package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd(){
        Calculator cal = new Calculator();
        assertEquals(7,cal.add(2,5));
    }

    public void testMultiplication(){
        Calculator cal = new Calculator();
        assertEquals(12,cal.multipilcation(2,6));
    }

    public void testDivision(){
        Calculator cal = new Calculator();
        assertEquals(2.0,cal.division(10,5));
    }

}