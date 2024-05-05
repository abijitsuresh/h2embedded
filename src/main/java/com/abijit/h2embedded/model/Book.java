package com.abijit.h2embedded.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "books", schema = "poc")
public class Book {
    @Id
    private int id;
    private UUID uuid;
    private String title;
    private String description;
    private boolean published;
}
