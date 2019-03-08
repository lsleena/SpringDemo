package com.leena.spring.jdbc.insertupdate;

import com.leena.spring.jdbc.insertupdate.Employee;
import com.leena.spring.jdbc.insertupdate.EmployeeDAO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDAOImpl implements EmployeeDAO {

    private NamedParameterJdbcTemplate namedJdbcTemplate;

    final String INSERT_QUERY = "insert into employee (name, age) values (:name, :age)";
    final String UPDATE_QUERY = "update employee set age = :age where id = :id";
    final String DELETE_QUERY = "delete from employee where id = :id";

    public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
        return namedJdbcTemplate;
    }

    public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
        this.namedJdbcTemplate = namedJdbcTemplate;
    }

    @Override
    public int save(Employee employee) {
        // Creating map with all required params
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("id",employee.getEmpId());
        paramMap.put("name", employee.getEmpName());
        paramMap.put("age", employee.getAge());
        // Passing map containing named params
        return namedJdbcTemplate.update(INSERT_QUERY, paramMap);
    }

    @Override
    public void update(Employee employee) {
        // Adding params using MapSqlParameterSource class
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("age", employee.getAge()).addValue("id", employee.getEmpId());
        int status = namedJdbcTemplate.update(UPDATE_QUERY, namedParameters);
        if(status != 0){
            System.out.println("Employee data updated for ID " + employee.getEmpId());
        }else{
            System.out.println("No Employee found with ID " + employee.getEmpId());
        }
    }

    @Override
    public void deleteEmpById(int empId) {
        // Adding params using MapSqlParameterSource class
        SqlParameterSource namedParameters = new MapSqlParameterSource("id", empId);
        int status = namedJdbcTemplate.update(DELETE_QUERY, namedParameters);
        if(status != 0){
            System.out.println("Employee data deleted for ID " + empId);
        }else{
            System.out.println("No Employee found with ID " + empId);
        }
    }
}