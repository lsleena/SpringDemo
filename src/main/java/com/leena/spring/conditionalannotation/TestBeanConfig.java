package com.leena.spring.conditionalannotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value ="classpath:config/test.properties", ignoreResourceNotFound=true)
public class TestBeanConfig {

    @Bean
    @Conditional(TestBeanCondition.class)
    public TestBean testBean() {

        System.out.println("test bean creation");
        return new TestBean();
    }
}

