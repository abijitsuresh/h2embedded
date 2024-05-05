package com.abijit.h2embedded.service;

import com.abijit.h2embedded.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BooksService {
    Flux<Book> getAll();
    Mono<Book> getById(Integer id);
    Flux<Book> getByTitleContaining(String titlePattern);
    Mono<Book> save(Book book);
}
