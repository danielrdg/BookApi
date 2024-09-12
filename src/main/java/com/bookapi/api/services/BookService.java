package com.bookapi.api.services;

import com.bookapi.api.entities.Book;
import com.bookapi.api.repositories.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    // Outros métodos de negócio...
}

