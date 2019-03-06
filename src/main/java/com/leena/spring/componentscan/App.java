package com.leena.spring.componentscan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("componentscan/appcontext1.xml");
        IPayService bean = (IPayService) context.getBean("payServiceImpl");
        System.out.println("Starting component scan App :\n");
        bean.performPayment();
        context.close();
    }
}