package com.leena.spring.dependency.constructor.type2.app;

import com.leena.spring.dependency.constructor.type1.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example of How Constructor arguments are resolved in Spring when they are not not
 * related by Inheritance
 */


public class App {

    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("constructor/type2/appcontext.xml");

        IPayService bean = (IPayService) context.getBean("paymentBean");
        bean.performPayment();
        context.close();
    }
}