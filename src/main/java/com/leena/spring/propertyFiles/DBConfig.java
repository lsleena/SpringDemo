package com.leena.spring.propertyFiles;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


/*
If you want to load test.properties file and want to ignore the resource if not found then you can do it as -
@Configuration
@PropertySource(value="classpath:config/test.properties", ignoreResourceNotFound=true)
 */
@Configuration
@PropertySource("classpath:config/db.properties")
public class DBConfig {
    @Value("${db.driverClassName}")
    private String dbDriverClass;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.username}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPwd;

    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(dbDriverClass);
        ds.setUrl(dbUrl);
        ds.setUsername(dbUser);
        ds.setPassword(dbPwd);
        return ds;
    }

    //register PropertySourcesPlaceholderConfigurer
    //in order to resolve ${...} placeholders
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        System.out.println("Inside propertyFIles");
        return new PropertySourcesPlaceholderConfigurer();
    }
}