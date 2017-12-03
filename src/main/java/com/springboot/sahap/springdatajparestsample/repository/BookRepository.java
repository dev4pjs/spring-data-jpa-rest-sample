package com.springboot.sahap.springdatajparestsample.repository;

import com.springboot.sahap.springdatajparestsample.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "book", collectionResourceRel = "book")
public interface BookRepository extends JpaRepository<Book,Integer> {

    @RestResource(rel = "title", path = "title")
    public Book findBookByTitle(String title);
}
