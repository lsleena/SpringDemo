package com.leena.spring.spEL.spELWithAnnotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

    @Value("1001")
    private long empId;
    @Value("Ram")
    private String empName;
    @Value("#{officeAddress}")
    private Address officeAddress;
    @Value("#{officeAddress.city}")
    private String officeLocation;
    @Value("#{officeAddress.getAddress('Ram')}")
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