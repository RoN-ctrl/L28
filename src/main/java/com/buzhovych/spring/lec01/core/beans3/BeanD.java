package com.buzhovych.spring.lec01.core.beans3;

import org.springframework.stereotype.Repository;

@Repository
public class BeanD {
    private String name;

    public BeanD() {
    }

    public BeanD(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
