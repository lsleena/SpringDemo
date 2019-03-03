package com.leena.spring.dependency.circular.circularDependencySetter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main( String[] args ){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext
                (AppConfig.class);
        ClassA objA = (ClassA)context.getBean("classA");
        objA.displayMessage();
        context.close();
    }
}