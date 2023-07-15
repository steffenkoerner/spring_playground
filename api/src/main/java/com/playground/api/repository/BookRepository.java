package com.playground.api.repository;

import com.playground.api.entity.Author;
import com.playground.api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}