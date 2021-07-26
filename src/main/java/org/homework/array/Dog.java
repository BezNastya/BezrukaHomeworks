package org.homework.array;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }
}
