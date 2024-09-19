package com.tap.ORM;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.ORM.Implementation.EmployeeDAOImpl;
import com.tap.ORM.entity.Employee;
import com.tap.config.AppConfig;

public class App {
  public static void main(String[] args) {
  
	  
	  //ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	  AnnotationConfigApplicationContext ac=new  AnnotationConfigApplicationContext(AppConfig.class);
	 Employee emp= (Employee) ac.getBean("employee");
	  EmployeeDAOImpl empdaoi=(EmployeeDAOImpl) ac.getBean("edao");
	  System.out.println(emp);
	  System.out.println(empdaoi);
	 // empdaoi.insertEmployee(emp);
	 ArrayList<Employee> al= empdaoi.fetchAll();
	 for(Employee e:al) {
		 System.out.println(e);
	 }
	System.out.println(empdaoi.fetchSpecific(1));
	 
	  
  }
}
