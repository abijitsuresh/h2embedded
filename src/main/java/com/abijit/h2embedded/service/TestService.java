package com.abijit.h2embedded.service;

import com.abijit.h2embedded.model.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TestService {
    Flux<Test> getAll();
    Mono<Test> getById(Integer id);
    Flux<Test> getByTitleContaining(String titlePattern);
    Mono<Test> save(Test test);
}
