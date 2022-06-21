package com.revature.training.importing;

public class ClassThree {
    // field is another name for a variable associated with objects of the class
    public int myNumber;
    public String myString;
    public boolean myBoolean;

    /*
        constructors are special methods that allow you to initialize fields when an object is created.
        The standard naming convention for the parameters is to match the fields they are meant to initialize
    */
    public ClassThree(int myNumber, String myString, boolean myBoolean){
        this.myNumber = myNumber;
        this.myString = myString;
        this.myBoolean = myBoolean;
    }    
}
