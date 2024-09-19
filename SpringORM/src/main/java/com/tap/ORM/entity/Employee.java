package com.tap.ORM.entity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")

@Component

public class Employee {

	@Id
	@Column(name="empid")
	private int empid;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empDesg")
	private String empDesg;
	
	@Column(name="empSalary")
	private String empSalary;
	
	public Employee() {
		
	}
	
	@Autowired
	public Employee(@Value("3")int empid, @Value("charvi")String empName,@Value("IT") String empDesg, @Value("2000")String empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSalary = empSalary;
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empDesg=" + empDesg + ", empSalary=" + empSalary
				+ "]";
	}
	
	
	
	
	
}
