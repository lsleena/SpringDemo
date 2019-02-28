package com.leena.spring.dependency.factoryMethod.staticMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("/factoryMethod/appcontext1.xml");

        TestBean testBean = (TestBean) context.getBean("testBean");
        System.out.println("Values " + testBean);
        System.out.println("Name - " + testBean.getName());
    }
}