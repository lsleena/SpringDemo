package com.leena.spring.jdbc.resultsetextractor;

import com.leena.spring.jdbc.insertupdate.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc/resultsetextractor/appcontext1.xml");
        EmployeeDAO dao = (EmployeeDAO)context.getBean("employeeDAO");
        List<Employee> empList = dao.findAllEmployees();
        for(Employee emp : empList){
            System.out.println("Name - "+ emp.getEmpName() + " Age - "
                    + emp.getAge());
        }
        context.close();
    }
}