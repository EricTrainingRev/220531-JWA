package com.tdd.calculator;

public class Calculator implements CalculatorInterface {

    /*
     we won't actually implement this code until we have written our tests
     */

    @Override
    public int addition(int numOne, int numTwo) {
        int result = numOne + numTwo;
        return result;
    }

    @Override
    public int subtraction(int numOne, int numTwo) {
        int result = numOne - numTwo;
        return result;
    }
    
}
