package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.spring.jdbc.model.Employee;
public class RowMapperImpl implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		employee.setEid(rs.getInt(1));
		employee.setEname(rs.getString(2));
		employee.setEcity(rs.getString(3));
		employee.setEsalary(rs.getDouble(4));
		return employee;
	}
	
}

