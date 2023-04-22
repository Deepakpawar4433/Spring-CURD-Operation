package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.model.Employee;
import com.spring.jdbc.model.Student;

public interface EmployeeDao {

	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int eid);
	public Employee display(int eid); 
	public List<Employee> displayAll(); 

}
