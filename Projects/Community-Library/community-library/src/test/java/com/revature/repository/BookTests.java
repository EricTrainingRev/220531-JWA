package com.revature.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.entities.Book;

public class BookTests {

    // here is where I am going to test my BookDAO

    // I declared the type as an Interace here
    public static BookDAOInterface bookDao;

    @BeforeClass
    public static void setup(){
        // but I initialized the field as a BookDAO object here
        // this is called coding to the interface: it makes our code more modual and easier
        // to adjust if necessary
        bookDao = new BookDAO();

        /*
            Once I know that my methods are working, I can add them to my setup method to programatically
            set up my test environment for future tests
        */

        Book setupUpdateBook = new Book(-3, "to be updated", "to be updated");
        bookDao.updateBook(setupUpdateBook);
    }

    /*
        I currently have no programatic way of resetting my test data, so I manually reset it with dbeaver
        before I run my tests
    */

    @Test // Make sure to add this @Test annotation
    public void createBookPositiveTest(){ // This is a positive test, so I note it in the test name
        Book testBook = new Book("test book title","test book author");
        Book result = bookDao.createBook(testBook);
        Assert.assertNotNull(result.getId());
    }

    @Test
    public void getAllBooksPositiveTest(){
        List<Book> bookList = bookDao.getAllBooks();
        Assert.assertTrue(bookList.size() >= 2);
    }

    @Test
    public void updateBookPositiveTest(){
        Book updatedBook = new Book(-3,"updated","updated");
        Book result = bookDao.updateBook(updatedBook);
        Assert.assertEquals("updated", result.getTitle());
    }

    @Test
    public void removeBookPositiveTest(){
        Book bookToBeDeleted = new Book(-4,"book to be deleted","book to be deleted");
        boolean result = bookDao.removeBook(bookToBeDeleted);
        Assert.assertTrue(result);
    }
    
}
