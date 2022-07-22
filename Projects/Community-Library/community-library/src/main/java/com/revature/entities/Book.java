package com.revature.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
    // we need fields to represent the data in our database
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;

    // we need an empty constructor for Hibernate
    public Book(){}

    // having this partial constructor will help to make sure we don't accidentatlly set a bad id
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // this constructor will allow our code to fully create Book objects from pre-existing data in our table
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // feel free to use the vsc source action... option to generate these
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // this is a nice quality of life method to override so we can better see what data we are working with
    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", title=" + title + "]";
    }

    
    
}
