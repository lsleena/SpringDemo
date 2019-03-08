package com.leena.spring.autoWiring.excludeBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        /* known error with having 2 beans of type IMOneyPayment
        AbstractApplicationContext context = new ClassPathXmlApplicationContext
                ("excludeBean/appcontext1.xml"); */

        AbstractApplicationContext context = new ClassPathXmlApplicationContext
                ("excludeBean/appcontext2.xml");
        IMoneyPayservice payBean = (IMoneyPayservice)context.getBean("payServiceBean");

        payBean.performPayment();

        context.registerShutdownHook();
    }
}