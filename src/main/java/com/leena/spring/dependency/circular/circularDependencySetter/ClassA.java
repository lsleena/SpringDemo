package com.leena.spring.dependency.circular.circularDependencySetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
    private ClassB objB;
 /*@Autowired
 ClassA(ClassB objB){
  this.objB = objB;
 }*/

    public ClassB getObjB() {
        return objB;
    }
    @Autowired
    public void setObjB(ClassB objB) {
        this.objB = objB;
    }

    public void displayMessage(){
        System.out.println("this is a test message");
    }
}