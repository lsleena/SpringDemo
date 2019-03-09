package com.leena.spring.jdbc.jdbcTemplate.selectquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    final String SELECT_BY_ID_QUERY = "SELECT id, name, age from EMPLOYEE where id = ?";
    final String SELECT_ALL_QUERY = "SELECT id, name, age from EMPLOYEE";

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee findEmployee(int empId) {
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY, new EmployeeMapper()
                , empId);
    }

    public List<Employee> findAllEmployees() {

        System.out.println("Inside JDBCTemplate ::");
        return this.jdbcTemplate.query(SELECT_ALL_QUERY, new EmployeeMapper());
    }

    private static final class EmployeeMapper implements RowMapper<Employee> {
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException         {
            Employee emp = new Employee();
            emp.setEmpId(rs.getInt("id"));
            emp.setEmpName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            return emp;
        }
    }
}