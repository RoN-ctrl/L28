package com.buzhovych.spring.core.list.beans;

import com.buzhovych.spring.core.list.Animal;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class Falcon implements Animal {
    @Override
    public String toString() {
        return "Falcon";
    }
}
