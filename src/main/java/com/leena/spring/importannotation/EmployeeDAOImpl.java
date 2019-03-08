package com.leena.spring.importannotation;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.*;

public class EmployeeDAOImpl implements EmployeeDAO {

    private NamedParameterJdbcTemplate namedJdbcTemplate;
    final String INSERT_QUERY = "insert into emp1 (ename) values (:ename)";

    public EmployeeDAOImpl(NamedParameterJdbcTemplate namedJdbcTemplate){

        this.namedJdbcTemplate = namedJdbcTemplate;
    }

    @Override
    public int save(Employee employee) {

        // Creating map with all required params
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("ename", employee.getEmpName());
      //  paramMap.put("age", employee.getAge());
        // Passing map containing named params
        return namedJdbcTemplate.update(INSERT_QUERY, paramMap);
    }
}