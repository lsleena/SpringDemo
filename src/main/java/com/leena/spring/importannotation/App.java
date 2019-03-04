package com.leena.spring.importannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext
                (com.leena.spring.importannotation.DBConfig.class);
        EmployeeDAO empBean = (EmployeeDAO)context.getBean("empService");
        Employee emp = new Employee();
        emp.setEmpName("Leena");
        emp.setAge(27);
        int status = empBean.save(emp);
        context.close();
    }

}