package com.buzhovych.spring.lec02.core.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements ParentBean, InitializingBean, DisposableBean {
    private String name;
    private int value;

    public BeanA() {
        System.out.println("beanA was created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("beanA.InitializingBean --> afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("beanA.DisposableBean --> destroy()");
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
