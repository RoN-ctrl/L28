package com.buzhovych.spring.lec02.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class BeanD implements ParentBean {

    @Value("${beanD.name}")
    private String name;

    @Value("${beanD.value}")
    private int value;

    public BeanD() {
        System.out.println("beanD was created");
    }

    private void customInit() {
        System.out.println("beanD.customInit()");
    }

    private void customDestroy() {
        System.out.println("beanD.customDestroy()");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", value = '" + value + '\'';
    }

}
