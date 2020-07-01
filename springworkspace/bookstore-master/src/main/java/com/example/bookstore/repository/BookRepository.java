package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	Book findByTitle(String title);

}
