package org.homework;

import org.homework.array.Task8Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(FirstConfig.class);
        for (String names : ctx1.getBeanDefinitionNames())
            System.out.println(names);

        System.out.println("Second Configuration: ");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SecondConfig.class);
        for (String names : ctx2.getBeanDefinitionNames())
            System.out.println(names);

        System.out.println("Animal Configuration: ");
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(Task8Config.class);
        for (String names : ctx3.getBeanDefinitionNames())
            System.out.println(names);
    }
}
