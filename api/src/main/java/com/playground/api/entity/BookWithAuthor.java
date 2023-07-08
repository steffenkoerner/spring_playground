package com.playground.api.entity;


/*
This class is needed for the RestBookController being able to return this class
 */
public class BookWithAuthor {

   Book book;
   Author author;

    public BookWithAuthor(Book book, Author author) {
        this.book = book;
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
