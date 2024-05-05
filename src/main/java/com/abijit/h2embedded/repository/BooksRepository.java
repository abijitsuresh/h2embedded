package com.abijit.h2embedded.repository;

import com.abijit.h2embedded.model.Book;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface BooksRepository extends R2dbcRepository<Book, Integer> {
    Flux<Book> findAllByTitleContainingIgnoreCase(String title);
}
