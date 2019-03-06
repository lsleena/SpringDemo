package com.leena.spring.javaconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IPayService bean = (IPayService) context.getBean("payService");
        bean.performPayment();
        context.close();
    }
}