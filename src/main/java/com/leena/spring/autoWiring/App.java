package com.leena.spring.autoWiring;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWiring/byConstructor/appcontext1.xml");

       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWiring/byName/appcontext1.xml");
      //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWiring/byType/appcontext1.xml");

        IPayService bean = (IPayService) context.getBean("payServiceBean");

        bean.performPayment();
        context.close();
    }
}
