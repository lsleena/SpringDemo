package com.leena.spring.importannotation;
import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value="classpath:/config/db.properties", ignoreResourceNotFound=true)
@Import({EmpConfig.class, JDBCConfig.class})
public class DBConfig {

   /* @Autowired
    private Environment env;

    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        System.out.println("User " + env.getProperty("db.username"));
        ds.setDriverClassName(env.getProperty("db.driverClassName"));
        ds.setUrl(env.getProperty("db.url"));
        ds.setUsername(env.getProperty("db.username"));
        ds.setPassword(env.getProperty("db.password"));
        return ds;
    }*/
}