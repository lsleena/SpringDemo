package com.leena.spring.dependency.factoryMethod.nonstaticMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("/factoryMethod/appcontext2.xml");

        TestBean testBean = (TestBean) context.getBean("testBean");
        System.out.println("Values " + testBean);
        System.out.println("Name is  - " + testBean.getName());
        System.out.println("Number is  - " + testBean.getNum());
    }
}