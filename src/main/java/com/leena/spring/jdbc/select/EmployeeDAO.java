package com.leena.spring.jdbc.select;

import com.leena.spring.jdbc.insertupdate.Employee;


import java.util.*;

    public interface EmployeeDAO {

        public List<Employee> findAllEmployees();

        Employee findEmployee(int i);

        //    public Object findEmployee(int empId);

    }

