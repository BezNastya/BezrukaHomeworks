package org.example;

import org.example.beans.BeanB;
import org.example.beans.BeanC;
import org.example.beans.BeanD;
import org.example.beans.BeanF;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class FirstConfig {

    @Bean(initMethod = "customInit",
            destroyMethod = "customDestroy")
    public BeanD beanD(){
        return new BeanD();
    }

    @Bean(initMethod = "customInit",
            destroyMethod = "customDestroy")
    @DependsOn("beanD")
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean(initMethod = "customInit",
            destroyMethod = "customDestroy")
    @DependsOn("beanB")
    public BeanC beanC(){
        return new BeanC();
    }

    @Bean
    @Lazy
    public BeanF beanF(){
        return new BeanF();
    }

    @Bean
    public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }
}
