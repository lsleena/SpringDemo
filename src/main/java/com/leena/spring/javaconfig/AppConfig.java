package com.leena.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
For Java based configuration in Spring you need to annotate JavaConfig class with @Configuration annotation.
When a class is annotated with @Configuration annotation the annotated class is identified as a configuration class.
This configuration class will contain the @Bean annotated methods, these methods will provide details about the beans
that are to be created and managed by the Spring application context.
 */


@Configuration
public class AppConfig {

    @Bean
    public IPayService payService() {

        PayServiceImpl payServiceImpl = new PayServiceImpl();

        payServiceImpl.setPayment(cashPayment());
        return payServiceImpl;
    }

    @Bean
    public IPayment cashPayment() {

        return new CashPayment();
    }
}
