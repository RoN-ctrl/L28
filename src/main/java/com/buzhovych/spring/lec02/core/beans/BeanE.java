package com.buzhovych.spring.lec02.core.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE implements ParentBean {
    private String name;
    private int value;

    public BeanE() {
        System.out.println("beanE was created");
    }

    @PostConstruct
    public void customPostConstruct() {
        System.out.println("beanE.customPostConstruct()");
    }

    @PreDestroy
    public void customPreDestroy() {
        System.out.println("beanE.customPreDestroy()");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", value = '" + value + '\'';
    }

}
