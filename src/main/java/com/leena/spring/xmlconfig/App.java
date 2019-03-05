package com.leena.spring.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("xmlconfig/appcontext1.xml");

        Employee employee = ctx.getBean(Employee.class);
        employee.setName("Leena Sunil Patil");

        Department department = ctx.getBean(Department.class);
        department.setName("Data Engineering");

        Operations operations = ctx.getBean(Operations.class);

        System.out.println(department);
        System.out.println(employee);

        operations.helloWorld();
    }
}