package com.leena.spring.autoWiring.usingResource;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("autoWiring/usingResource/appcontext1.xml");
        RatingsImpl bean = (RatingsImpl) context.getBean("ratingsBean");
        bean.rateMovies();
        context.close();
    }
}