package org.example.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bean-d")
public class BeanD {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanD\n" + "Name: " + name + "\nValue: " + value;
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

    public void customInit(){
        System.out.println("BeanD:\nInside custom init method");
    }

    public void customDestroy(){
        System.out.println("BeanD:\nInside custom destroy method");
    }
}
