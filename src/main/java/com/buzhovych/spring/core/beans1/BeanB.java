package com.buzhovych.spring.core.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private String name;

    public BeanB() {
    }

    public BeanB(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
