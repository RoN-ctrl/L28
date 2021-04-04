package com.buzhovych.spring.lec02.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class BeanD {

    @Value("${beanD.name}")
    private String name;

    @Value("${beanC.value}")
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

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", value = '" + value + '\'';
    }

}
