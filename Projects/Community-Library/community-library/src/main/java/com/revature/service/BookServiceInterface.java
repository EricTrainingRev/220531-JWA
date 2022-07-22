package com.revature.service;

import java.util.List;

import com.revature.entities.Book;

public interface BookServiceInterface {
    /*
        For my business rule of not allowing Tolkien works I am going to make a method that returns a boolean
        that indicates whether the business rule is being followed or not. If the rule is being followed
        I then allow the data to be passed to the repository layer, but if the business rule is not being
        followed than I do not allow the data into the repository layer
    */

    // boolean checkBookForTolkien(Book bookToCheck); moved this method to the BusinessRules class in utils

    /*
        When you set up an application that has a repository layer and a service layer you want to have
        a service method for each of your repository methods. 
    */

    Book serviceCreateBook(Book newBook); 

    List<Book> serviceGetAllBooks();

    Book serviceUpdateBook(Book updatedBook); 

    boolean serviceRemoveBook(Book bookToBeDeleted);
}
