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


    //////////////////////////////////////////////////////////////////////////////////////
    ///////////////////    TODO: Move below to differnt file for rest playground !!!!
    ///////////////////
    /////////////////////////////////////////////////////////////////////////////////////


    @PostMapping
    public ResponseTransfer SayHelloWith() {
        return new ResponseTransfer ("");
    }

    // TODO: Send json object with error code back instead of html page
    // Implement some post/put/delete rest handler

    public class ResponseTransfer {
        private String text;

        ResponseTransfer(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }


    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
    public class DogNotFoundException extends RuntimeException {

        public DogNotFoundException() {
        }

        public DogNotFoundException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class BadRequestException extends RuntimeException {
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {
    }
}
