package com.revature.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.revature.entities.Book;
import com.revature.exceptions.InvalidBook;
import com.revature.service.BookServiceInterface;

import io.javalin.http.Handler;



public class BookController {

    private BookServiceInterface bookService;
    private Gson gson;

    public BookController(BookServiceInterface bookService){
        this.bookService = bookService;
        this.gson = new Gson();
    }

    /*
        This BookController is going to parse the information recieved in HTTP request bodies, send the information
        to the appropriate service method, and craft an HTTP Response for us based upon the data recieved from
        the service methods
    */

    /*
        This is the basic setup for how to handle HTTP requests via Javalin: you create a variable that is a 
        reference to a lambda, provide an argument called ctx (stands for context, provided by Javalin), and then
        you write your code to handle the request
    */
    public Handler getHelloWorld = ctx -> {
        ctx.result("Hello world!");
        ctx.status(200);

    };

    public Handler getAllBooks = ctx -> {
        List<Book> books = this.bookService.serviceGetAllBooks();
        /*
            the books arraylist above contains multiple Java Book objects: these need to turn into
            JSON formatting to be able to attach them to the HTTP Response body. We can use the GSON library
            we acquired from the maven repository to handle this conversion process for us
        */
  
        // the toJson method provided by Gson turns our collection of Book objects into a formatted string
        String booksJSON = this.gson.toJson(books);
        // we use the ctx.result() method to attach the booksJSON to the response body
        ctx.result(booksJSON);
        ctx.status(200);
    };

    public Handler deleteBook = ctx -> {
        // the ctx.body() method creates a java string object from the content of the request body
        String json = ctx.body();
        // we then use Gson to convert the json string into the java class we are working with
        Book bookToDelete = this.gson.fromJson(json, Book.class);
        // to make sure that I am updating the book that I indicated in the http request I set the path id to the id of the book
        String identifier = ctx.pathParam("id");
        int bookId = Integer.parseInt(identifier);
        bookToDelete.setId(bookId);
        // we then pass the java object we created into the appropriate service method for validation
        this.bookService.serviceRemoveBook(bookToDelete);
        // because I am not returning any special entity with this method I will use a Map to create my key/value pair message for the json
        Map<String, String> message = new HashMap<>();
        message.put("message", "book was deleted");
        // once the map is made we convert it into a json
        String messageJson = this.gson.toJson(message);
        // then we attach it to the response body and set the status code
        ctx.result(messageJson);
        ctx.status(200); // will need to double check status code at some point
    };

    public Handler updateBook = ctx -> {
        try{
            // get json from request body
            String json = ctx.body();
            // convert json to our java object
            Book updatedBook = this.gson.fromJson(json, Book.class);
            // this does the same process of getting the id from the path and setting it as the id of the updated book
            updatedBook.setId(Integer.parseInt(ctx.pathParam("id")));
            // pass the data into the service layer and get method result back
            Book result = this.bookService.serviceUpdateBook(updatedBook);
            // convert the result into a json
            String resultJson = this.gson.toJson(result);
            // set the response body and status code
            ctx.result(resultJson);
            ctx.status(200);
        }catch(InvalidBook e){
            // create a map to easily make key/value pair for json
            Map<String, String> message = new HashMap<>();
            // place the exception message into the map
            message.put("message", e.getMessage());
            // convert the map into a json
            String messageJson = this.gson.toJson(message);
            // attach the json to the response body and set the status code
            ctx.result(messageJson);
            ctx.status(400);
        }


    };

    public Handler createBook = ctx -> {
        try{
            String json = ctx.body();
            Book newBook = this.gson.fromJson(json, Book.class);
            Book result = this.bookService.serviceCreateBook(newBook);
            String resultJson = this.gson.toJson(result);
            ctx.result(resultJson);
            ctx.status(201);
        }catch(InvalidBook e){
            Map<String, String> message = new HashMap<>();
            message.put("message", e.getMessage());
            String messageJson = this.gson.toJson(message);
            ctx.result(messageJson);
            ctx.status(400);
        }

    };
}
