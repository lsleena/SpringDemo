package com.leena.spring.autoWiring.usingAutowired;


import com.leena.spring.autoWiring.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("autoWiring/usingAutowired/appcontext1.xml");
        // Getting PayServiceImpl
        IPayService bean = (IPayService) context.getBean("paymentBean");
        bean.performPayment();
        context.close();
    }
}