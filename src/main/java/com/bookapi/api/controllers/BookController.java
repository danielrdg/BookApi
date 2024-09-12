package com.bookapi.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBooks() {
        return "books";
    }

    @GetMapping("/books/{id}")
    public String getBook(@PathVariable int id) {
        return "book";
    }

    @PostMapping("/books")
    public String addBook() {
        return "add book";
    }

    @PutMapping("/books/{id}")
    public String updateBook(@PathVariable int id) {
        return "update book";
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id) {
        return "delete book";
    }
}
