package com.leena.spring.jdbc.jdbcTemplate.insertquery;


import java.util.List;

public interface EmployeeDAO {
    public int save(Employee employee);

    public void update(Employee employee);

    public void deleteEmpById(int empId);
        public int[] batchInsert(final List<Employee> employees);

}