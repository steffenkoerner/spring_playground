package com.playground.api.service;


import com.playground.api.entity.Book;
import com.playground.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public Book getBookById(String id) {

        Optional<Book> book = bookRepository.findById(id);
        return book.get();

    }

}
