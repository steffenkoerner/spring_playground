package com.playground.api.controller;

import com.playground.api.entity.Author;
import com.playground.api.entity.Book;
import com.playground.api.service.AuthorService;
import com.playground.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLBookController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorService authorService;
    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookService.getBookById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorService.getAuthorById(book.getAuthorId());
    }
}
