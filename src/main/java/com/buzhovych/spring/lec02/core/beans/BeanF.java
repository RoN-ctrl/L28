package com.buzhovych.spring.lec02.core.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanF extends ParentBean {
    private String name;
    private int value;

    public BeanF() {
        System.out.println("beanF was created");
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", value = '" + value + '\'';
    }

}
