package com.leena.spring.importannotation;

public class Employee {
    private int empId;
    private String empName;
    private int age;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }
}