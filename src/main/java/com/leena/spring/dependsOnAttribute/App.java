package com.leena.spring.dependsOnAttribute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("dependsOnAttribute/appcontext1.xml");
        ClassB cbObj = (ClassB)context.getBean("classB");

        //cbObj.displayValue();

        context.close();
    }

}