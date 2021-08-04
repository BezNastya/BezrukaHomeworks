package org.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanE\n" + "Name: " + name + "\nValue: " + value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("BeanE: inside @PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("BeanE: inside @PreDestroy");
    }
}

