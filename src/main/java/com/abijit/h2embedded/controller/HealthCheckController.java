package com.abijit.h2embedded.controller;

import com.abijit.h2embedded.model.HealthCheckResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class HealthCheckController {
    @GetMapping(value = "/health-check", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<HealthCheckResponse>> healthCheck() {
        return Mono.just(ResponseEntity.ok(new HealthCheckResponse("OK")));
    }
}
