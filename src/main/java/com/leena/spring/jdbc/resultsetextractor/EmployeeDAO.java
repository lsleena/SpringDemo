package com.leena.spring.jdbc.resultsetextractor;



import com.leena.spring.jdbc.insertupdate.Employee;

import java.util.*;

public interface EmployeeDAO {

    public List<Employee> findAllEmployees();

}

