package com.tdd.calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTests {

    // this is part of coding to the interface: by declaring the type as the interface you make your code more flexible
    // any class that implements the CalculatorInterface could go here
    public static CalculatorInterface calculator;

    @BeforeClass
    public static void setup(){
        calculator = new Calculator(); // this initializes the calculator field we set above
    }

    /*
        When these tests are run, if the expected and actual values do not match an exception is thrown and the test is marked as failing.
        This creates a very clear way of determining whether I have successfully implemented my methods as inteded or not. Ideally, each test
        method should only check one function, and it should only check one piece of functionality of that test.
     */

    @Test // this annotation tells maven that this method is a test that must be validated
    public void additionTest(){
        // because 5 + 5 is 10, i put the expected value as 10, the actual value as the result of the method being tested
        Assert.assertEquals(10, calculator.addition(5, 5));
    }

    @Test 
    public void subtractionTest(){
        // because 5 - 5 is 0 I put the expected value as 0, the actual value as the result of the method being tested
        Assert.assertEquals(0, calculator.subtraction(5, 5));
    }
    
}
