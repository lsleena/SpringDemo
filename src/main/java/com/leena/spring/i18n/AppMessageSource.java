package com.leena.spring.i18n;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppMessageSource {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext
                ("/i18n/appcontext2.xml");

        TestService testService = context.getBean("testService", TestService.class);
        testService.displayMessage();

        context.close();
    }
}
