package com.playground.api.controller;


import com.playground.api.entity.Author;
import com.playground.api.entity.Book;
import com.playground.api.entity.BookWithAuthor;
import com.playground.api.service.AuthorService;
import com.playground.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTBookController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorService authorService;

    @GetMapping("/book/{id}")
    public Book bookById(@PathVariable(required = true) String id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/author/{id}")
    public Author authorById(@PathVariable(required = true) String id) {
        return authorService.getAuthorById(id);
    }

    @GetMapping("/bookWithAuthor/{id}")
    public BookWithAuthor bookWithDetailsById(@PathVariable(required = true) String id) {
        Book book = bookService.getBookById(id);
        Author author = authorService.getAuthorById(book.getAuthorId());

        BookWithAuthor bookWithAuthor = new BookWithAuthor(book,author);

        return bookWithAuthor;
    }

}
