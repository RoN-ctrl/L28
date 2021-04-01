package com.buzhovych.spring.core.beans2;

import org.springframework.stereotype.Repository;

@Repository
public class CatAnimal {
    private String name;

    public CatAnimal() {
    }

    public CatAnimal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
