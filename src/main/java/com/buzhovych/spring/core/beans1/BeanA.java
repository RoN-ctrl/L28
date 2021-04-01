package com.buzhovych.spring.core.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private String name;

    public BeanA() {
    }

    public BeanA(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
