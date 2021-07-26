package org.homework.array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllAnimals {
    @Autowired
    private List<Animal> animals;

    public void printAnimals(){
        for (Animal a : animals)
            System.out.println(a.getAnimal());
    }
}
