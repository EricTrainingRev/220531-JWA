package com.revature.training.access.two;

import com.revature.training.access.one.FirstClass;

public class SecondClass {
    public static void main(String[] args){
        FirstClass myObject = new FirstClass();

        myObject.publicField = true;
        // myObject.protectedField = true;
        // System.out.println(myObject.protectedField);
        // because the protectedField has the protected access modifier, it is not accessible here

        // myObject.defaultField = true; default access also does not allow us to access this field here

        // myObject.privateField = true; private fields are also not available here
    }
}
