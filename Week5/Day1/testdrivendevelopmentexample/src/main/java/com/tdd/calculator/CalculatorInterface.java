package com.tdd.calculator;

// notice the class declaration has been replaced with the interface keyword
public interface CalculatorInterface {

    /*
        All interface methods are, by default, public abstract methods. The abstract keyword means that the
        method is not given a method body where it is declared, and it instead has its functionality determined
        by an inheriting class

     */
    int addition(int numOne, int numTwo);

    int subtraction(int numOne, int numTwo);
    
}
