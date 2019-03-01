package com.leena.spring.spEL;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("spEL/appcontext1.xml");

        Employee emp = (Employee)context.getBean("employee");
        System.out.println("Office address " + emp.getOfficeAddress().getNumber());
        System.out.println("Location of office " + emp.getOfficeLocation());
        System.out.println("Employee info " + emp.getEmployeeInfo());
    }
}