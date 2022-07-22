package com.revature.exceptions;

/*
    This class is going to be my custom exception that is thrown anytime a business rule is broken. Exceptions are
    Java's way of saying something has gone wrong with the code. If you do not write any code to handle these 
    exceptions they will cause your application to crash and you will have more work to do in the long run. 

    to create your own exception you either need to extend the base Exception class or the RunTimeException class.

    If you extend the Exception class you create what is called a "checked exception". Checked exceptions MUST be
    handled with a try/catch block or your code will not compile. An unchecked exception does not need to be
    placed in a try/catch block (it will crash your application if not handled).

*/

public class InvalidBook extends RuntimeException {
    public InvalidBook (String message){
        // super is a reference to the parent class' constructor
        super(message);
    }

    /*
        Because the example below is a RuntimeException we do not need to place it inside of a try/catch block, but
        if the class extended Exception instead then our main method would need a try catch block
    */

    public static void main(String[] args) {

        /*
            A try/catch block is used when you know how your code might fail and you want your software to handle
            the failure gracefully. This could be anything, from a custom exception to a built in one: if the code
            in the try block triggers an exception you are expecting in one or more catch blocks you created, then
            the code in the associated catch block will execute instead of your application crashing
        */

        try{
            throw new InvalidBook("this could be a message for the end user, or just for a dev working on code");
        } catch(InvalidBook e) {
            System.out.println(e.getMessage());
        }

        // to throw your own exception you use the throw keyword and then create your exception object with your message
        throw new InvalidBook("this could be a message for the end user, or just for a dev working on code");
    }
    
}
