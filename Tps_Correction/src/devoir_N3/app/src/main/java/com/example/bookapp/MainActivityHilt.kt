package com.example.bookapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.adapter.BookAdapter
import com.example.bookapp.model.Book
import com.example.bookapp.service.BookService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivityHilt : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    // Injection de BookService via Hilt
    @Inject
    lateinit var bookService: BookService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewBooks)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val books = bookService.getBooks()
        displayBooks(books)
    }

    private fun displayBooks(books: List<Book>) {
        val adapter = BookAdapter(books)
        recyclerView.adapter = adapter
    }
}