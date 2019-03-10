package com.leena.spring.jdbc.select;

import com.leena.spring.jdbc.insertupdate.Employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("jdbc/appcontext2.xml");
        EmployeeDAO dao = (EmployeeDAO)context.getBean("employeeDAOImpl");
        // finding by ID
        Employee emp = dao.findEmployee(5);
        System.out.println("Name - "+ emp.getEmpName() + " Age - " + emp.getAge());
        // finding all
        List<Employee> empList = dao.findAllEmployees();
        System.out.println("Name - "+ empList.get(3).getEmpName() +
                " Age - " + empList.get(3).getAge());
    }
}