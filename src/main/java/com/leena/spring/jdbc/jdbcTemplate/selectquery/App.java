package com.leena.spring.jdbc.jdbcTemplate.selectquery;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("jdbc/appcontext2.xml");
        EmployeeDAO dao = (EmployeeDAO)context.getBean("employeeDAOImpl");

        // Uncomment this to find employee by ID
        Employee emp = dao.findEmployee(2);
        System.out.println("Name - "+ emp.getEmpName() + " Age - " + emp.getAge());
        System.out.println();
        List<Employee> empList = dao.findAllEmployees();
        System.out.println("Name - "+ empList.get(1).getEmpName() + " Age - "
                + empList.get(1).getAge());
    }
}
