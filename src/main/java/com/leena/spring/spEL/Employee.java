package com.leena.spring.spEL;

public class Employee {

    private long empId;
    private String empName;
    private Address officeAddress;
    private String officeLocation;
    private String employeeInfo;

    public String getEmpName() {

        return empName;
    }
    public void setEmpName(String empName) {

        this.empName = empName;
    }

    public long getEmpId() {

        return empId;
    }

    public void setEmpId(long empId) {

        this.empId = empId;
    }

    public Address getOfficeAddress() {

        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {

        this.officeAddress = officeAddress;
    }

    public String getOfficeLocation() {

        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {

        this.officeLocation = officeLocation;
    }

    public String getEmployeeInfo() {

        return employeeInfo;
    }

    public void setEmployeeInfo(String employeeInfo) {

        this.employeeInfo = employeeInfo;
    }
}