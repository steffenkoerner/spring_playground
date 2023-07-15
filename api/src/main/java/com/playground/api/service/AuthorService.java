package com.playground.api.service;

import com.playground.api.repository.AuthorRepository;
import com.playground.api.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public List GetAllAuthors() {
        List authors = new ArrayList();
        authorRepository.findAll().forEach(author -> authors.add(author));
        return authors;
    }

    public Author GetAuthorById(String id) {
        Optional<Author> author = authorRepository.findById(id);
        return author.get();
    }

}
