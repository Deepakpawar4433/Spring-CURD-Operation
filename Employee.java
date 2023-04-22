package com.spring.jdbc.model;

public class Employee {
	private int eid;
	private String ename;
	private String ecity;
	private double esalary;
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, String ecity, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + ", esalary=" + esalary + "]";
	}
	
}
