package org.example;

import org.example.beans.BeanF;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableConfigurationProperties
@SpringBootApplication
public class Main {

    public static void main(String[] args){
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(FirstConfig.class);
        for (String names : ctx1.getBeanDefinitionNames())
            System.out.println(names);

        System.out.println("Second Configuration: ");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SecondConfig.class);
        for (String names : ctx2.getBeanDefinitionNames())
            System.out.println(names);

        ctx2.getBean(BeanF.class);

    }
}
