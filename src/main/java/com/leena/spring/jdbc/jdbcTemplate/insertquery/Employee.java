package com.leena.spring.jdbc.jdbcTemplate.insertquery;

public class Employee {
    private int empId;
    private String empName;
    private int age;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    public Employee(String empName, int age){
        this.empName = empName;
        this.age = age;
    }
}