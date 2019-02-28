package com.leena.spring.dependency.factoryMethod.singletonClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("factoryMethod/appcontext.xml");

        Admin bean = (Admin) context.getBean("adminBean");
        System.out.println("Creating instance of class Admin:");
        System.out.println("Values \n" + bean);

        context.close();
    }
}
