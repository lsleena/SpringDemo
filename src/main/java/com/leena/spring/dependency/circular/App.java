package com.leena.spring.dependency.circular;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.leena.spring.dependency.circular.AppConfig;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext
                (AppConfig.class);
    }

}
