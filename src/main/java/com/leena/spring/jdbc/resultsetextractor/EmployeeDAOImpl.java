package com.leena.spring.jdbc.resultsetextractor;

import com.leena.spring.jdbc.insertupdate.Employee;
import com.mysql.jdbc.ResultSetImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    final String SELECT_ALL_QUERY = "SELECT id, name, age from EMPLOYEE";

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> findAllEmployees() {

        System.out.println("Entering findAllEmployees::");
        return (List<Employee>) jdbcTemplate.query(SELECT_ALL_QUERY, (ResultSet rs) -> {
            List<Employee> list = new ArrayList<Employee>();
            while(rs.next()){
                Employee emp = new Employee();
                emp.setEmpId(rs.getInt("id"));
                emp.setEmpName(rs.getString("name"));
                emp.setAge(rs.getInt("age"));
                list.add(emp);
            }
            return list;
        });
    }
}