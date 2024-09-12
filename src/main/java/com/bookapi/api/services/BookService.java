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

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public boolean deleteBookById(Long id) {
        if (findBookById(id) == null) {
            return false;
        } else {
            bookRepository.deleteById(id);
            return true;
        }
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null); // Pode retornar null ou lançar uma exceção personalizada
    }

    public List<Book> findBooksByTitle(String title) {
        return bookRepository.findByTitleIgnoreCase(title);
    }

    public List<Book> findBooksByAuthor(String author) {
        return bookRepository.findByAuthorIgnoreCase(author);
    }

    public List<Book> findBooksByPublicationYear(int year) {
        return bookRepository.findByPublicationDateYear(year);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book updatedBook) {
        if (bookRepository.existsById(id)) {
            updatedBook.setId(id); // Certifique-se de que o ID está correto
            return bookRepository.save(updatedBook);
        }
        return null; // Ou lance uma exceção
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
