package com.leena.spring.dependency.setter.app;

import com.leena.spring.dependency.constructor.type1.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("setter/appcontext.xml");

        IPayService bean = (IPayService) context.getBean("paymentBean");
        bean.performPayment();
        context.close();
    }
}