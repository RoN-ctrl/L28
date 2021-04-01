package com.buzhovych.spring.core.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private String name;

    public BeanC() {
    }

    public BeanC(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
