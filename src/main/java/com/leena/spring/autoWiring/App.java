package com.leena.spring.autoWiring;


import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
Known ERROR
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWiring/byname/appcontext1.xml");

        IPayService bean = (IPayService) context.getBean("payServiceBean");

        bean.performPayment();
        context.close();
    }
}
