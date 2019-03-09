package com.leena.spring.jdbc.jdbcTemplate.insertquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
    private JdbcTemplate jdbcTemplate;
    final String INSERT_QUERY = "insert into employee (name, age) values (?, ?)";
    final String UPDATE_QUERY = "update employee set age = ? where id = ?";
    final String DELETE_QUERY = "delete from employee where id = ?";

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee employee) {
        return jdbcTemplate.update(INSERT_QUERY, employee.getEmpName(), employee.getAge());
    }

    public void update(Employee employee) {
        int status = jdbcTemplate.update(UPDATE_QUERY, employee.getAge(),
                employee.getEmpId());
        if(status != 0){
            System.out.println("Employee data updated for ID " + employee.getEmpId());
        }else{
            System.out.println("No Employee found with ID " + employee.getEmpId());
        }
    }

    public void deleteEmpById(int empId) {
        int status = jdbcTemplate.update(DELETE_QUERY, empId);
        if(status != 0){
            System.out.println("Employee data deleted for ID " + empId);
        }else{
            System.out.println("No Employee found with ID " + empId);
        }
    }


    @Override
    public int[] batchInsert(final List<Employee> employees) {
        final String INSERT_EMP_QUERY = "insert into employee (name, age) values (?, ?)";
        return this.jdbcTemplate.batchUpdate(INSERT_EMP_QUERY,
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        // emp id is auto generated so not provided
                        ps.setString(1, employees.get(i).getEmpName());
                        ps.setInt(2, employees.get(i).getAge());
                    }

                    @Override
                    public int getBatchSize() {
                        return employees.size();
                    }
                });
    }



}