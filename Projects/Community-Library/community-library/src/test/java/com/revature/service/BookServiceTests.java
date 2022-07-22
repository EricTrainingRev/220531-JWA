package com.revature.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.entities.Book;
import com.revature.exceptions.InvalidBook;
import com.revature.repository.BookDAO;
import com.revature.repository.BookDAOInterface;
import com.revature.utils.BusinessRules;

public class BookServiceTests {

    public static BookDAOInterface bookDao;
    public static BookServiceInterface bookService;
    public static BusinessRules businessRules;

    /*
        the fields below are going to be used for our mock tests: we will use Mockito to create mock objects of
        the dao and rules classes in order to be able to pre-determine their method results in order to perform
        both positive and negative tests for the service methods.
    */
    public static BookDAOInterface mockDao;
    public static BusinessRules mockRules;
    public static BookServiceInterface serviceWithMocks;

    @BeforeClass
    public static void setup(){
        /*
            if we were to use these three fields our service tests would be integration tests: the database would 
            need to be set up with the correct test data, the business rules would need to be implemented correctly,
            and we would need to reset that data everytime. This is not a bad thing, per se, but the goal is to
            get all of our methods tested via unit testing
        */
        // bookDao = new BookDAO();
        businessRules = new BusinessRules(); // leaving this uncommented for business rule tests
        // bookService = new BookService(bookDao, businessRules);

        // the mock() method creates a mock object we can control
        mockDao = Mockito.mock(BookDAO.class); // this creates a mock dao object we can control
        mockRules = Mockito.mock(BusinessRules.class); // this creates a mock rules object we control
        serviceWithMocks = new BookService(mockDao, mockRules);
    }

    /*
        I am leaving the BusinessRules unit tests in here for the example, but in a work environment I would
        probably move these tests into their own class
    */

    /*
        This is a negative test because we are checking that our service method correctly identifies
        that a business rule is being broken and responds with the apprpriate return value
    */
    @Test
    public void checkBookForTolkienNegativeTest(){
        Book badBook = new Book("The Fellowship of the Ring","J. R. R. Tolkien");
        boolean result = businessRules.checkBookForTolkien(badBook);
        Assert.assertFalse(result);
    }

    /*
        This is a positive test because we are checking that our service method correctly identifies
        that all relevant business rules are being adhered to and responds with the apprpriate return 
        value 
    */
    @Test
    public void checkBookForTolkienPositiveTest(){
        Book goodBook = new Book("Crime and Punishment", "I cant spell this name");
        boolean result = businessRules.checkBookForTolkien(goodBook);
        Assert.assertTrue(result);
    }

    /*
        THE TESTS BELOW ARE TO SHOW OFF MOCKING AND STUBBING
    */

    /*
        VOCAB:

        Mock: a fake object that you can use to control return values of associated methods
        Stub: a faked return value
    */

    @Test
    public void mockExampleCreateBookPositive(){
        Book goodBook = new Book("Crime and Punishment", "I cant spell this name");
        /*
            This is a positive test, so we know that the business rule needs to return true, and the dao needs
            to return the book with a newly minted id number: we need to tell our mocked objects to do just that

            when() is the method used to determine what mock object and assocaited method is being faked
            thenReturn() is the method used to determine what the return value is for our faked method
        */
        Mockito.when(mockRules.checkBookForTolkien(goodBook)).thenReturn(true);
        Mockito.when(mockDao.createBook(goodBook)).thenReturn(new Book(1,"Crime and Punishment", "I cant spell this name"));
        
        Book result = serviceWithMocks.serviceCreateBook(goodBook);
        Assert.assertNotNull(result.getId());
    }

    /*
        When testing for exceptions, an easy way to validate you have the correct exception is to check that
        the exception message is correct. You will need to use a try/catch block for this
    */

    @Test
    public void mockExampleCreateBookNegative(){
        try{
            Book badBook = new Book("The Fellowship of the Ring","J. R. R. Tolkien");
            /*
                for this negative test I don't need to mock the results of the dao because the dao should never be
                reached with this test
            */
            Mockito.when(mockRules.checkBookForTolkien(badBook)).thenReturn(false);

            // the serviceCreateBook method below SHOULD, based on the input, throw the InvalidBook exception
            Book result = serviceWithMocks.serviceCreateBook(badBook);
            // if no exception is thrown by the serviceCreateBook method then the line below will make our test fail
            Assert.fail();          
        } catch(InvalidBook e){
            // here we check that we get both the expected exception and the correct message
            Assert.assertEquals("invalid book: please try again", e.getMessage());
        }

    }

    @Test
    public void mockExampleUpdateBookPositive(){
        Book goodBook = new Book(0,"Crime and Punishment", "I cant spell this name");
        Mockito.when(mockRules.checkBookForTolkien(goodBook)).thenReturn(true);
        Mockito.when(mockDao.updateBook(goodBook)).thenReturn(goodBook);
        Book result = serviceWithMocks.serviceUpdateBook(goodBook);
        Assert.assertEquals("Crime and Punishment", result.getTitle());
    }

    @Test
    public void mockExampleUpdateBookNegative(){
        try{
            Book badBook = new Book("The Fellowship of the Ring","J. R. R. Tolkien");
            Mockito.when(mockRules.checkBookForTolkien(badBook)).thenReturn(false);
            Book result = serviceWithMocks.serviceUpdateBook(badBook);
            Assert.fail();
        } catch(InvalidBook e){
            // the getMessage() method comes from the parent Exception class
            Assert.assertEquals("invalid book: please try again", e.getMessage());
        }

    }
    
}
