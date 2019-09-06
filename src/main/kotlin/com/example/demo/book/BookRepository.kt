package com.example.demo.book

import org.springframework.data.mongodb.repository.MongoRepository


public interface BookRepository : MongoRepository<Book, Long> {

    fun findOneByTitle(title : String) : Book
}