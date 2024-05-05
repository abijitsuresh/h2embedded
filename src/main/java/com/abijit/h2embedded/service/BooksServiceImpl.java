package com.abijit.h2embedded.service;

import com.abijit.h2embedded.model.Book;
import com.abijit.h2embedded.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BooksServiceImpl implements BooksService {
    private final BooksRepository booksRepository;
    @Override
    public Flux<Book> getAll() {
        return booksRepository.findAll();
    }

    @Override
    public Mono<Book> getById(Integer id) {
        return booksRepository.findById(id);
    }

    @Override
    public Flux<Book> getByTitleContaining(String titlePattern) {
        return booksRepository.findAllByTitleContainingIgnoreCase(titlePattern);
    }

    @Override
    public Mono<Book> save(Book book) {
        return booksRepository.save(book);
    }
}
