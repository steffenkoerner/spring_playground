package com.playground.api.service;

import com.playground.api.entity.Author;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class AuthorService {

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling"),
            new Author("author-2", "Herman", "Melville"),
            new Author("author-3", "Anne", "Rice")
    );

    public Author getAuthorById(String id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }

}
