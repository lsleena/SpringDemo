package com.leena.spring.dependency.factoryMethod.staticMethod;

public class TestBeanFactory {

    public static TestBean createTestBean(int num) {

        TestBean testBean = new TestBean();
        testBean.setNum(num);
        return testBean;
    }
}