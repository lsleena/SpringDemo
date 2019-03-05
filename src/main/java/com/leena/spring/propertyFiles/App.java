package com.leena.spring.propertyFiles;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.leena.spring.propertyFiles.DBConfig;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext
                (DBConfig.class);
        BasicDataSource ds = (BasicDataSource)context.getBean("dataSource");
        System.out.println("URL - " + ds.getUrl());
    }

}