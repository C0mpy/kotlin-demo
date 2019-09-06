package com.example.demo.book

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "books")
class Book(var title: String, var description: String)