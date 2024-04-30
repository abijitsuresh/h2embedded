package com.abijit.h2embedded.controller;

import com.abijit.h2embedded.model.Test;
import com.abijit.h2embedded.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Test> getTests() {
        return testService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Test> createTest(@RequestBody Test test) {
        return testService.save(test);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Test> getTest(@PathVariable int id) {
        return testService.getById(id);
    }

    @GetMapping(value = "/title/{title-pattern}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Test> getTestsByTitlePattern(@PathVariable("title-pattern") String titlePattern) {
        return testService.getByTitleContaining(titlePattern);
    }
}
