package com.example.demo.book

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService {

    @Autowired
    lateinit var bookRepository: BookRepository

    fun getAll() : List<Book> {
        return bookRepository.findAll()
    }

    fun addBasicBook() : Book {
        val book = Book(title = "basic book", description = "this book is soo basic")
        return bookRepository.save(book)
    }
}