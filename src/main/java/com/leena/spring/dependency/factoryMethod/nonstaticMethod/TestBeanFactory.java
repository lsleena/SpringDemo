package com.leena.spring.dependency.factoryMethod.nonstaticMethod;

public class TestBeanFactory {

    public  TestBean createTestBean(int num) {

        TestBean testBean = new TestBean();
        testBean.setNum(num);
        return testBean;
    }
}

