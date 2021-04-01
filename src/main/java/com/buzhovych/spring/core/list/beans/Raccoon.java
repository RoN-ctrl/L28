package com.buzhovych.spring.core.list.beans;

import com.buzhovych.spring.core.list.Animal;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class Raccoon implements Animal {
    @Override
    public String toString() {
        return "Raccoon";
    }
}
