package com.leena.spring.dependency.circular.circularDependencySetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
    private ClassA objA;
    public ClassA getObjA() {
        return objA;
    }
    @Autowired
    public void setObjA(ClassA objA) {
        this.objA = objA;
    }
}