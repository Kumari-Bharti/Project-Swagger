package com.example.Swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Swagger.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}