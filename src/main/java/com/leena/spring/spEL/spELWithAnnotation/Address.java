package com.leena.spring.spEL.spELWithAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("officeAddress")
public class Address {

    @Value("101")
    private String number;
    @Value("#{'M I Road'}")
    private String street;
    @Value("JaipurCity")
    private String city;
    @Value("RajasthanState")
    private String state;
    @Value("#{'302001'}")
    private String pinCode;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getAddress(String empName){
        return empName + " works at " + number + ", " + street + ", " + city
                + ", " + state + ", " + pinCode;
    }
}