package com.leena.spring.i18n;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext
                ("i18n/appcontext1.xml");
        System.out.println("date format msg " + context.getMessage(
                "dateformat", null, Locale.UK));

        System.out.println("date format msg " + context.getMessage("dateformat", null, Locale.US));

                System.out.println("Name error msg " + context.getMessage("argument.required",
                        new Object[]{"Name"}, Locale.US));
        System.out.println("Name error msg " + context.getMessage("argument.required",
                new Object[]{"Name"}, Locale.GERMANY));

        context.close();
    }
}