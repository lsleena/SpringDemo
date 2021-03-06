package com.leena.spring.autoWiring.usingAutowired;


import com.leena.spring.autoWiring.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

    public static void main(String[] args) {

        //
        //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
        //                ("autoWiring/usingAutowired/appcontext1.xml");
        //     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
        //                ("autoWiring/usingAutowired/appcontext2.xml");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("autoWiring/usingAutowired/appcontext3.xml");
        // Getting PayServiceImpl
        IPayService1 bean = (IPayService1) context.getBean("paymentBean");

        bean.performPayment();
        context.close();
    }
}