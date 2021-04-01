package com.buzhovych.spring.core.list;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Zoo {
    private Animal cage1;
    private Animal cage2;
    private Animal cage3;

    public Zoo(Animal cage1, @Qualifier("raccoon") Animal cage2, @Qualifier("falcon") Animal cage3) {
        this.cage1 = cage1;
        this.cage2 = cage2;
        this.cage3 = cage3;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "cage 1 = " + cage1 +
                ", cage 2 = " + cage2 +
                ", cage 3 = " + cage3 +
                '}';
    }
}
