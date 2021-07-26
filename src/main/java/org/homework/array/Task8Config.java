package org.homework.array;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class Task8Config {

    @Bean
    @Primary
    public Animal cat(){
        return new Cat();
    }

    @Bean("dog")
    public Animal dog(){
        return new Dog();
    }

    @Bean("hamster")
    public Animal hamster(){
        return new Hamster();
    }
}
