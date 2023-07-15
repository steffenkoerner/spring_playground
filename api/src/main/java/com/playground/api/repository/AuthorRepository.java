package com.playground.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.playground.api.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {

}