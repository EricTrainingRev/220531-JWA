package com.revature.training.scopes;

public class Scopes {
    /*
        Scopes referes to the accessability of variables: there are two ways of thinking about scopes:
        the scope of variables inside of objects, and the scope of variables inside of methods
     */

    /*
        when creating fields in a class, you can assign them to the class scope, or the instance scope. To
        make a field part of the instance scope, you don't have to do anything special, just declare the access
        modifier (if any), the field type, and the name of the field. This will make any objects created
        of the Scopes class have its own field (not shared). 
    */ 

    public String myString; // this field is part of the instance scope (or object scope)

    /*
        If instance variables are unique across objects of the same class, then static (or class) variables are shared among them. You use
        the key word "static" to make a field part of the class scope
     */

    public static int mySharedNum; // this field is part of the static scope (or class scope)

    public static void main(String[] args) {
        // side note: if you do not declare a constructor, a "no-args" constructor is automatically provided by the runtime environemnt

        Scopes objectOne = new Scopes(); // this creates a Scopes object with no fields initialized
        System.out.println(objectOne.myString); // this prints null to the console
        objectOne.myString = "this is the string for object one"; // this assigns the new string value to the field
        System.out.println(objectOne.myString);

        Scopes objectTwo = new Scopes(); // this creates a new Scopes object with no field initialized
        System.out.println(objectTwo.myString);
        objectTwo.myString = "this is the string for object two";
        System.out.println(objectTwo.myString);

        // so far we have done nothing with the static field: let's set it to 5

        Scopes.mySharedNum = 5;

        System.out.println(Scopes.mySharedNum); // this is the proper way to access a static field
        // the two ways below will work, but it is considered bad practice
        System.out.println(objectOne.mySharedNum);
        System.out.println(objectTwo.mySharedNum);

        methodBlockScopeExample();
    }

    /*
        the next pairing of scopes to look at is the method and block scope. Method scope is a reference
        to any variable that is created inside of a method, whereas block scope is a reference to any variable
        created inside of a control-flow block of code. 
     */

     public static void methodBlockScopeExample(){
        int methodScopeVariable = 10; // this variable exists within the method scope
        if(true){
            int blockScopeVariable = 12; // this variable exists within the block scope
            System.out.println(methodScopeVariable);
            System.out.println(blockScopeVariable);
        }
        System.out.println(methodScopeVariable);
        // System.out.println(blockScopeVariable); my application will break because the variable referenced does not exist in this scope
     }
    
}
