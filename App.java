package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	//spring jdbc-->JdbcTemplate
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	EmployeeDao employeeDao=context.getBean("employeeDao", EmployeeDao.class);
    	
    	//Insert data
    	/*
    	Employee employee=new Employee();
    	employee.setEid(77);
    	employee.setEname("Rishabh");
    	employee.setEcity("Thane");
    	employee.setEsalary(20000);
    	int r=employeeDao.insert(employee);
    	System.out.println(r);
    	*/
    	
    	//Update data
		/*
		 Employee employee=new Employee(); 
		 employee.setEname("Vishal");
		 employee.setEcity("Delhi"); 
		 employee.setEsalary(15000.00); 
		 employee.setEid(44);
		 int r=employeeDao.update(employee); 
		 System.out.println(r);
		*/
    	
    	//Delete data
		/*
		 int r=employeeDao.delete(44); 
		 System.out.println(r);
		*/
    	
    	//display data
		/*
		 Employee employee=employeeDao.display(77); 
		 System.out.println(employee);
		*/
    	
    	//Display All data
		
		 List<Employee> employees=employeeDao.displayAll(); 
		 for(Employee s:employees){ 
			 System.out.println(s); 
		 }
		
    }
}
