package com.abijit.h2embedded.controller;

import com.abijit.h2embedded.model.Book;
import com.abijit.h2embedded.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BooksController {
    private final BooksService booksService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Book> getBooks() {
        return booksService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Book> createBook(@RequestBody Book book) {
        return booksService.save(book);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Book> getBook(@PathVariable int id) {
        return booksService.getById(id);
    }

    @GetMapping(value = "/title/{title-pattern}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Book> getBooksByTitlePattern(@PathVariable("title-pattern") String titlePattern) {
        return booksService.getByTitleContaining(titlePattern);
    }
}
