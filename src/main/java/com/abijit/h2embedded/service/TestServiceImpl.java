package com.abijit.h2embedded.service;

import com.abijit.h2embedded.model.Test;
import com.abijit.h2embedded.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;
    @Override
    public Flux<Test> getAll() {
        return testRepository.findAll();
    }

    @Override
    public Mono<Test> getById(Integer id) {
        return testRepository.findById(id);
    }

    @Override
    public Flux<Test> getByTitleContaining(String titlePattern) {
        return testRepository.findAllByTitleContainingIgnoreCase(titlePattern);
    }

    @Override
    public Mono<Test> save(Test test) {
        return testRepository.save(test);
    }
}
