package com.buzhovych.spring.lec01.core.list.beans;

import com.buzhovych.spring.lec01.core.list.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary
@Order(Ordered.LOWEST_PRECEDENCE)
public class Cat implements Animal {
    @Override
    public String toString() {
        return "Cat";
    }
}
