package org.example.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bean-b")
public class BeanB {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanB\n" + "Name: " + name + "\nValue: " + value;
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
        System.out.println("BeanB:\nInside custom init method");
    }

    public void customDestroy(){
        System.out.println("BeanB:\nInside custom destroy method");
    }

    public void newCustomInit(){
        System.out.println("BeanB:\nNEEEEEW init");
    }
}
