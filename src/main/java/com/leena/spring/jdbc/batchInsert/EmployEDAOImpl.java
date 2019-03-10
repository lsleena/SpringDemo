package com.leena.spring.jdbc.batchInsert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Resource
public class EmployEDAOImpl implements EmployEDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public int[][] batchInsert(final List<EmployE> employees) {
        final String INSERT_EMP_QUERY = "insert into employee (name, age) values (?, ?)";
        return jdbcTemplate.batchUpdate(INSERT_EMP_QUERY, employees, 3,
                new ParameterizedPreparedStatementSetter<EmployE>() {
                    @Override
                    public void setValues(PreparedStatement ps, EmployE emp) throws SQLException {
                        ps.setString(1, emp.getEmpName());
                        ps.setInt(2, emp.getAge());
                    }
                });
    }
}