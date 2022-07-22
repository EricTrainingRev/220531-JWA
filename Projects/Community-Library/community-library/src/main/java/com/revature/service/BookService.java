package com.revature.service;

import java.util.List;

import com.revature.entities.Book;
import com.revature.exceptions.InvalidBook;
import com.revature.repository.BookDAOInterface;
import com.revature.utils.BusinessRules;

public class BookService implements BookServiceInterface {

    /*
        Because my service class is gate-keeping for the repository layer, it needs to have some way
        of sending data that has been validated to the repository layer. This is accomplished by using 
        dependency injection: I create a field of the proper data access object interface, and then I used
        the consutrctor at runtime to create the proper implementation object for said interface. I also decided
        to add an extra field for a BusinessRules class, which will store all my business rule methods. By
        seperating the validation checks from the service methods themselves I am able to reuse the same code
        in multiple locations, should the need arise
    */

    // this dao is found in the repository package
    private BookDAOInterface bookDao;
    // this BusinessRules class can be seen in the utils package
    private BusinessRules businessRules;

    public BookService(BookDAOInterface bookDao, BusinessRules businessRules){
        // the bookDao and businessRules fields are part of the object scope, so make sure to use the this keyword
        this.bookDao = bookDao;
        this.businessRules = businessRules;
    }

    @Override
    public Book serviceCreateBook(Book newBook) {
        // the businessRules object contains the method that checks whether the new book is valid or not
        if(this.businessRules.checkBookForTolkien(newBook)){
            return this.bookDao.createBook(newBook);
        } else {
            /*
                here we create an InvalidBook object and we use the throw keyword to tell Java to throw an exception
                of this type. This exception will need to be handled in our API, and it will inform the API that
                an error message needs to be returned to the user
            */
            throw new InvalidBook("invalid book: please try again");
        }
    }

    @Override
    public List<Book> serviceGetAllBooks() {
        /*
            because there are no business rules associated with this service method, and because we have 
            already tested the getAllBooks method in the repository layer, we can skip writing any unit
            tests for this service method and just return the results of the dao method
        */
        return this.bookDao.getAllBooks();
    }

    @Override
    public Book serviceUpdateBook(Book updatedBook) {
        // the businessRules object contains the method that checks whether the new book is valid or not
        if(this.businessRules.checkBookForTolkien(updatedBook)){
            return this.bookDao.updateBook(updatedBook);
        } else {
            throw new InvalidBook("invalid book: please try again");
        }
    }

    @Override
    public boolean serviceRemoveBook(Book bookToBeDeleted) {
        /*
            because there are no business rules associated with this service method, and because we have 
            already tested the removeBook method in the repository layer, we can skip writing any unit
            tests for this service method and just return the results of the dao method
        */
        return this.bookDao.removeBook(bookToBeDeleted);
    }

    /*
        SEE THE SECTION BELOW TO GET EXAMPLES OF HOW MOCKING/STUBBING WORKS, AND HOW YOU CAN DO POSITIVE/NEGATIVE
        TESTS FOR YOUR SERVICE LAYER
    */

    /*
        While your projects only require negative tests for any business logic your service layer must validate,
        it is unreasonable to think that you will only ever need to make negative tests in your servie layer. Any
        complex application will have multiple checks and possible return values in a service layer, and often times
        you will need to make positve/negative tests for all the possibilities. This is where Mocking comes into play.
        
        Mocking is a process of creating classes that you controll the return value of: by pre-determing the return
        values of methods you are not trying to test (this is called stubbing) you can check specific pieces of
        functionality in your code, and therefore create true unit tests in your service layer
    */
    
}
