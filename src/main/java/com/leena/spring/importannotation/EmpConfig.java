package com.leena.spring.importannotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmpConfig {

    @Autowired
    private NamedParameterJdbcTemplate namedJdbcTemplate;

    @Bean
    public EmployeeDAO empService() {

        return new EmployeeDAOImpl(namedJdbcTemplate);
    }
}