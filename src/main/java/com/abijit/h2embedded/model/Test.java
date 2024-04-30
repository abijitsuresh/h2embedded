package com.abijit.h2embedded.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {
    @Id
    private int id;
    private UUID uuid;
    private String title;
    private String description;
    private boolean published;
}
