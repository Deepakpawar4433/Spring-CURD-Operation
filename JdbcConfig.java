package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JdbcConfig {

	@Bean(name= {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/deepak");
		ds.setUsername("root");
		ds.setPassword(null);
		
		return ds;
	}
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	/*
	 * @Bean(name={"employeeDao"}) 
	 * public EmployeeDao getEmployeeDao() { 
	 * EmployeeDaoImpl employeeDao=new EmployeeDaoImpl(); 
	 * employeeDao.setJdbcTemplate(getTemplate());
	 * return employeeDao; }
	 */
}
