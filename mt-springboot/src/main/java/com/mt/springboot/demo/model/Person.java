package com.mt.springboot.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Person {
    private final UUID Id;

    @NonNull
    private final String name;

    public Person(@JsonProperty("id")  UUID id, @JsonProperty("name") String name) {
        Id = id;
        this.name = name;
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}
