package com.revature.repository;

import java.util.List;

import com.revature.entities.Book;


public interface BookDAOInterface {
    /*
        This interface is where I will declare the methods that I need to test. All methods I create here
        will by default be considered public and abstract
        public:     can be accessed anywhere
        abstract:   the implementation for the method must be handled elsewhere
    */

    // create
    /*
        I chose the Book return type because Hibernate has an easy way of returning the generated id so
        I can add it to my newBook and return it as the result, which makes for an easy validation in my
        tests.

        I choose the Book object to be my parameter because it provides an easy way for me to  get both the
        title and the author name into the database. It can also hold the newly generated id and I can
        check it to make sure my method is working correctly.
    */
    Book createBook(Book newBook); 

    // reads
    List<Book> getAllBooks();

    // updates
    Book updateBook(Book updatedBook); 

    // deletes
    boolean removeBook(Book bookToBeDeleted);
}
