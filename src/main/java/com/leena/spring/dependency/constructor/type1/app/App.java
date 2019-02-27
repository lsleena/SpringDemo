package com.leena.spring.dependency.constructor.type1.app;

import com.leena.spring.dependency.constructor.type1.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * an example of constructor dependency injection in Spring, there is one class called Payment service
 * which is dependent on Payment class and
 * also has integer amount and those constructor arguments are injected through a constructor DI.
 */

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("constructor.type1/appcontext.xml");

        IPayService bean = (IPayService) context.getBean("paymentBean");
        bean.performPayment();
        context.close();
    }
}

