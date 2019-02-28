package com.leena.spring.dependency.constructor.type3.app;

import com.leena.spring.dependency.constructor.type1.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Example of ambiguity in case of constructor dependency injection
 * CashPayment and CreditPayment inherits same Interface
 */


public class App {

    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("constructor.type3/appcontext.xml");

        IPayService bean = (IPayService) context.getBean("paymentBean");
        bean.performPayment();
        System.out.println(bean);
        IPayService bean1 = (IPayService) context.getBean("paymentBean");
        bean1.performPayment();
        System.out.println(bean1);
        context.close();

    }
}