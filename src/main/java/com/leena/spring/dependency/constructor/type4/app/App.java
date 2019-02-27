package com.leena.spring.dependency.constructor.type4.app;

import com.leena.spring.dependency.constructor.type4.AmountBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Injecting primitive values using constructor dependency injection
 */

public class App {

    public static void main( String[] args ) {

        // Using type attribute

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("constructor.type4/appcontext.xml");

        AmountBean bean = (AmountBean)context.getBean("amountBean");
        bean.displayValue();

        // Using index attribute

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext
                ("constructor.type4/appcontext1.xml");

        AmountBean bean1 = (AmountBean)context.getBean("amountBean");
        bean1.displayValue();
        context.close();
        context1.close();
    }
}