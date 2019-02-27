package com.leena.spring.dependency.constructor.app;

import com.leena.spring.dependency.constructor.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("appcontext.xml");

        IPayService bean = (IPayService) context.getBean("paymentBean");
        bean.performPayment();
        context.close();

    }
}

