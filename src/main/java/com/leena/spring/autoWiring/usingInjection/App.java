package com.leena.spring.autoWiring.usingInjection;


import com.leena.spring.autoWiring.usingAutowired.IPayService1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //
        //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
        //                ("autoWiring/usingAutowired/appcontext1.xml");
        //     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
        //                ("autoWiring/usingAutowired/appcontext2.xml");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("autoWiring/usingInjection/appcontext1.xml");
        // Getting PayServiceImpl
        IPayService1 bean = (IPayService1) context.getBean("paymentBeanInject");

        bean.performPayment();
        context.close();
    }
}