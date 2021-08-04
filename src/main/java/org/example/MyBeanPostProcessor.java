package org.example;

import org.example.beans.*;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanA)
            if (((BeanA) bean).getName() == null || ((BeanA) bean).getValue() <= 0) {
                System.err.println("BeanA:\nValidation wrong");
                return null;
            }
        if (bean instanceof BeanB)
            if (((BeanB) bean).getName() == null || ((BeanB) bean).getValue() <= 0) {
                System.err.println("BeanB:\nValidation wrong");
                return null;
            }
        if (bean instanceof BeanC)
            if (((BeanC) bean).getName() == null || ((BeanC) bean).getValue() <= 0) {
                System.err.println("BeanC:\nValidation wrong");
                return null;
            }
        if (bean instanceof BeanD)
            if (((BeanD) bean).getName() == null || ((BeanD) bean).getValue() <= 0) {
                System.err.println("BeanD:\nValidation wrong");
                return null;
            }
        if (bean instanceof BeanE)
            if (((BeanE) bean).getName() == null || ((BeanE) bean).getValue() <= 0) {
                System.err.println("BeanE:\nValidation wrong");
                return null;
            }
        if (bean instanceof BeanF)
            if (((BeanF) bean).getName() == null || ((BeanF) bean).getValue() <= 0) {
                System.err.println("BeanF:\nValidation wrong");
                return null;
            }
        return bean;
    }
}
