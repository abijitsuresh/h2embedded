package com.abijit.h2embedded.repository;

import com.abijit.h2embedded.model.Test;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface TestRepository extends R2dbcRepository<Test, Integer> {
    Flux<Test> findAllByTitleContainingIgnoreCase(String title);
}
