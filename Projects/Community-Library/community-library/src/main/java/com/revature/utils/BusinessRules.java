package com.revature.utils;

import com.revature.entities.Book;

public class BusinessRules {
    /*
        This class currently contains only the one business rule, but anymore that are added can then be
        utilized in any classes that have a field for this class
    */

    public boolean checkBookForTolkien(Book bookToCheck) {
        /*
            This method is checking to see if the book being entered/updated is following business
            rules: if it is, a true is returned because it is following the rules and the data can be
            sent into the repository layer. If the book is not following business rules a false is 
            returned and the data should NOT be sent to the repository layer
        */

        // make sure to use the equals method when comparing strings
        if(bookToCheck.getAuthor().equals("J. R. R. Tolkien")){
            // if the business rule is broken we return false
            return false;
        } else {
            // if the business rule is being followed we return true
            return true;
        }
    }
    
}
