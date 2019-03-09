package com.leena.spring.jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.leena.spring.jdbc.select.EmployeeDAO;
import com.leena.spring.jdbc.insertupdate.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
        return namedJdbcTemplate;
    }

    public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
        this.namedJdbcTemplate = namedJdbcTemplate;
    }

    private NamedParameterJdbcTemplate namedJdbcTemplate;

    final String SELECT_BY_ID_QUERY = "SELECT id, name, age from EMPLOYEE where id = :id";
    final String SELECT_ALL_QUERY = "SELECT id, name, age from EMPLOYEE";

    @Autowired
    public EmployeeDAOImpl(NamedParameterJdbcTemplate namedJdbcTemplate) {
        this.namedJdbcTemplate = namedJdbcTemplate;
    }


    @Override
    public List<Employee> findAllEmployees() {

         // return namedJdbcTemplate.queryForList(SELECT_ALL_QUERY, new EmployeeMapper());
         return namedJdbcTemplate.query(SELECT_ALL_QUERY, new EmployeeMapper());
    }

    @Override
    public Employee findEmployee(int empId) {
        return null;

        //  return this.namedJdbcTemplate.queryForObject(SELECT_BY_ID_QUERY, new MapSqlParameterSource(
        //      "id", empId), new EmployeeMapper());
    }

    private static final class EmployeeMapper implements RowMapper<Employee> {

        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee emp = new Employee();
            emp.setEmpId(rs.getInt("id"));
            emp.setEmpName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            return emp;
        }
    }
}
