package org.example;

import static org.junit.Assert.assertEquals;

import org.example.Service.Calculator;
import org.junit.Test;

public class CalculatorTest {

    // Test for adding two positive numbers
    @Test
    public void testAddTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    // Test for adding two negative numbers
    @Test
    public void testAddTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.add(-1, -1));
    }

    // Test for adding multiple positive numbers
    @Test
    public void testAddMultipleNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.add(1, 2, 3, 4, 5));
    }

    // Test for adding multiple numbers with positive and negative values
    @Test
    public void testAddMultipleNumbersWithPositiveAndNegative() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2, 3, -3));
    }

    // Test for multiplying two positive numbers
    @Test
    public void testMultiplyTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.multiply(1, 3));
    }

    // Test for multiplying negative and positive numbers
    @Test
    public void testMultiplyNegativeAndPositive() {
        Calculator calculator = new Calculator();
        assertEquals(-3, calculator.multiply(-1, 3));
    }

    // Test for multiplying multiple positive numbers
    @Test
    public void testMultiplyMultipleNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.multiply(1, 2, 3, 4, 5));
    }

    // Test for multiplying multiple numbers with one negative number
    @Test
    public void testMultiplyMultipleNumbersWithNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-120, calculator.multiply(-1, 2, 3, 4, 5));
    }

    // Test for subtracting two positive numbers
    @Test
    public void testSubtractTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(5, 2));
    }

    // Test for subtracting multiple numbers
    @Test
    public void testSubtractMultipleNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(10, 5, 3, 2));
    }

    // Test for subtracting numbers with a negative result
    @Test
    public void testSubtractWithNegativeResult() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.subtract(5, 10));
    }
}
