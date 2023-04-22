package com.spring.jdbc.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.spring.jdbc.model.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Employee employee) {
		//inserting query
    	String query="insert into Employee(eid, ename, ecity, esalary)values(?,?,?,?)";
		int r=this.jdbcTemplate.update(query,employee.getEid(), employee.getEname(), employee.getEcity(), employee.getEsalary());
    	return r;
	}
	public int update(Employee employee) {
		//update query
		String query="update Employee set ename=?, ecity=?, esalary=? where eid=?";
		int r=this.jdbcTemplate.update(query, employee.getEname(), employee.getEcity(), employee.getEsalary(), employee.getEid());
		return r;
	}
	public int delete(int eid) {
		//deletee query
		String query="delete from Employee where eid=?";
		int r=this.jdbcTemplate.update(query,eid);	
		return r;
	}
	public Employee display(int eid) {
		//select query
		String query="select * from Employee where eid=?";
		RowMapper<Employee> rowMapper=new RowMapperImpl();
		Employee employee=this.jdbcTemplate.queryForObject(query, rowMapper, eid);
		return employee;
	}
	
	public List<Employee> displayAll() {
		//selectAll query
		String query="select * from Employee";
		List<Employee> employees=this.jdbcTemplate.query(query, new RowMapperImpl());
		return employees;
	}
	
	public JdbcTemplate getJdbcTemplate() {	
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}










