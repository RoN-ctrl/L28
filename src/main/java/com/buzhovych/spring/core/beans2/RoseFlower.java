package com.buzhovych.spring.core.beans2;

import org.springframework.stereotype.Repository;

@Repository
public class RoseFlower {
    private String name;

    public RoseFlower() {
    }

    public RoseFlower(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
