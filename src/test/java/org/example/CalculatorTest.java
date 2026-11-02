package org.example;

import junit.framework.TestCase;
import org.junit.Test;


public class CalculatorTest extends TestCase {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.add(3,2));
    }


    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();
        assertEquals(6,calculator.multiplication(3,2));
    }

    @Test
    public void testDivion(){
        Calculator calculator = new Calculator();
        assertEquals(10.0,calculator.division(100,10));
    }

    @Test
    public void testRemainder(){
        Calculator calculator = new Calculator();
        assertEquals(1,calculator.remainder(5,2));
    }
}