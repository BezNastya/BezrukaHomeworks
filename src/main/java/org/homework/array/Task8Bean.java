package org.homework.array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Task8Bean {
    @Autowired
    private Animal animal1;

    @Autowired
    @Qualifier("dog")
    private Animal animal2;

    @Autowired
    @Qualifier("hamster")
    private Animal animal3;
}
