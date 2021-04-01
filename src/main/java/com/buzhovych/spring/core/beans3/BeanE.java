package com.buzhovych.spring.core.beans3;

import org.springframework.stereotype.Repository;

@Repository
public class BeanE {
    private String name;

    public BeanE() {
    }

    public BeanE(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
