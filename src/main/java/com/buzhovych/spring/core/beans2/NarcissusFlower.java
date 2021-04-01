package com.buzhovych.spring.core.beans2;

import org.springframework.stereotype.Repository;

@Repository
public class NarcissusFlower {
    private String name;

    public NarcissusFlower() {
    }

    public NarcissusFlower(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
