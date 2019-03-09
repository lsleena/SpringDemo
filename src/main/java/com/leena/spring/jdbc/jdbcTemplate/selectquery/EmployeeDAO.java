package com.leena.spring.jdbc.jdbcTemplate.selectquery;


import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAllEmployees();

    public Employee findEmployee(int empId);
}