package com.buzhovych.spring.lec02.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class BeanB implements ParentBean {

    @Value("${beanB.name}")
    private String name;

    @Value("${beanB.value}")
    private int value;

    public BeanB() {
        System.out.println("beanB was created");
    }

    private void customInit() {
        System.out.println("beanB.customInit()");
    }

    private void customDestroy() {
        System.out.println("beanB.customDestroy()");
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
