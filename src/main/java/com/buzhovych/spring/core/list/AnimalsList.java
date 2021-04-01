package com.buzhovych.spring.core.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsList {
    @Autowired
    private List<Animal> animals;

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
