package com.leena.spring.jdbc.batchInsert;

import com.leena.spring.jdbc.batchInsert.EmployEDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("jdbc/resultsetextractor/batchInsert/appcontext1.xml");

        EmployEDAO empDAO =  (EmployEDAOImpl)context.getBean("employEDAOImpl");
        List< EmployE> empList = createEmpList();
        int[][] rows = empDAO.batchInsert(empList);
        for (int i = 0; i < rows.length; i++) {
            System.out.println("Number of rows inserted- " + rows[i].length);
        }

    }

    private static List< EmployE> createEmpList() {
        EmployE emp1 = new  EmployE("Mike", 32);
        EmployE emp2 = new  EmployE("Rahul", 27);
        EmployE emp3 = new  EmployE("Smith", 28);
        EmployE emp4 = new  EmployE("Steve", 45);
        EmployE emp5 = new  EmployE("Rajesh", 21);
        List< EmployE> empList = new ArrayList< EmployE>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        return empList;
    }
}