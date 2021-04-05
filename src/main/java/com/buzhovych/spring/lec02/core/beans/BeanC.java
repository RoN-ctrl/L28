package com.buzhovych.spring.lec02.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class BeanC implements ParentBean{

    @Value("${beanC.name}")
    private String name;

    @Value("${beanC.value}")
    private int value;

    public BeanC() {
        System.out.println("beanC was created");
    }

    private void customInit() {
        System.out.println("beanC.customInit()");
    }

    private void customDestroy() {
        System.out.println("beanC.customDestroy()");
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
