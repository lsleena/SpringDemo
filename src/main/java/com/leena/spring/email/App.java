package com.leena.spring.email;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("email/appcontext1.xml");
        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.sendMail();
        context.close();
    }
}