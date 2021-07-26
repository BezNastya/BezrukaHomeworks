package org.homework.array;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Hamster implements Animal{
    @Override
    public String getAnimal() {
        return "Hamster";
    }
}
