package com.leena.spring.conditionalannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestBeanConfig.class);

        TestBean testBean = (TestBean)context.getBean("testBean");
        testBean.setName("Leena");
        System.out.println("Name is : " + testBean.getName());
        context.close();
    }

    }
