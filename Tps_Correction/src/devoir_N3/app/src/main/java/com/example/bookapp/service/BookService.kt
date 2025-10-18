package com.example.bookapp.service

import com.example.bookapp.model.Book

class BookService {
    fun getBooks(): List<Book> {
        return listOf(
            Book("1984", "George Orwell"),
            Book("Le Petit Prince", "Antoine de Saint-Exupéry"),
            Book("Harry Potter à l'école des sorciers", "J.K. Rowling"),
            Book("L'Étranger", "Albert Camus")
        )
    }
}