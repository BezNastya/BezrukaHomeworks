package org.example.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanA\n" + "Name: " + name + "\nValue: " + value;
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

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA:\n\"destroy\" method of interface implemented");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA:\n\"afterPropertiesSet\" method of interface implemented");
    }
}
