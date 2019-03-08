package com.leena.spring.jdbc.insertupdate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("jdbc/appcontext1.xml");

        EmployeeDAO dao=(EmployeeDAO)context.getBean("employeeDAO");
        Employee emp = new Employee();
        emp.setEmpName("Leena");
        emp.setAge(35);
        emp.setEmpId(1);
        int status = dao.save(emp);
        System.out.println(status);
        // For update
        emp.setEmpId(1);
        emp.setAge(12);
        dao.update(emp);

        // For delete
        dao.deleteEmpById(10);
    }
}