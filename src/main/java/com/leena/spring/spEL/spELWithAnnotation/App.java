package com.leena.spring.spEL.spELWithAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("spEL/appcontext2.xml");

        Employee emp = (Employee)context.getBean("employee");

        System.out.println("\nInside Spring Expression Langauge with Annotation Example : \n ");
        System.out.println("Office address " + emp.getOfficeAddress().getNumber());
        System.out.println("Location of office " + emp.getOfficeLocation());
        System.out.println("Employee info " + emp.getEmployeeInfo());
    }
}

