package com.example.demo.book

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("books")
class BookEndpoint {

    @Autowired
    lateinit var bookService: BookService

    @GetMapping
    fun getAll() = bookService.getAll()

    @PostMapping
    fun addBasicBook() = bookService.addBasicBook()

}