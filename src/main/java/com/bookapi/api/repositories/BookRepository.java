package com.bookapi.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookapi.api.entities.Book;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Encontra todos os livros por título (ignora a capitalização)
    List<Book> findByTitleIgnoreCase(String title);

    // Encontra todos os livros por autor
    List<Book> findByAuthorIgnoreCase(String author);

    // Encontra livros publicados em um ano específico
    @Query("SELECT b FROM Book b WHERE FUNCTION('YEAR', b.publicationDate) = :year")
    List<Book> findByPublicationDateYear(int year);
}
