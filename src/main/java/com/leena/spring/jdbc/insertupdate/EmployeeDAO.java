package com.leena.spring.jdbc.insertupdate;

import com.leena.spring.jdbc.insertupdate.Employee;

public interface EmployeeDAO {

    public int save(Employee employee);

    public void update(Employee employee);

    public void deleteEmpById(int empId);

}