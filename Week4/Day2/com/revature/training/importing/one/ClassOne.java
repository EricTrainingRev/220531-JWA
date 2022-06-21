/*
    when working with Java folders are called packages, and any Java files created in sub folders 
    (in relaiton to the root directory of the application) need to have a package declaration as the first
    line of code
*/
package com.revature.training.importing.one;

public class ClassOne {
    // field is another name for a variable associated with objects of the class
    public int myNumber;
    public String myString;
    public boolean myBoolean;

    /*
        constructors are special methods that allow you to initialize fields when an object is created.
        The standard naming convention for the parameters is to match the fields they are meant to initialize
    */
    public ClassOne(int myNumber, String myString, boolean myBoolean){
        this.myNumber = myNumber;
        this.myString = myString;
        this.myBoolean = myBoolean;
    }
    
}