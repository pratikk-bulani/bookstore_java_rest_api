package com.bookstore.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookstore.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthor(String author);
}