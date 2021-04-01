package com.buzhovych.spring.core.beans3;

import org.springframework.stereotype.Repository;

@Repository
public class BeanF {
    private String name;

    public BeanF() {
    }

    public BeanF(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
