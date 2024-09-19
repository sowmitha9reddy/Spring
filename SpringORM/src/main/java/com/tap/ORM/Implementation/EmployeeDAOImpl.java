package com.tap.ORM.Implementation;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.tap.ORM.entity.Employee;
import com.tap.ORM.interfaces.EmployeeDAO;

@Component("edao")
public class EmployeeDAOImpl implements  EmployeeDAO {

	
	//@Autowired
	SessionFactory sessionFactory;
	
	private Session session;

	private Transaction t;
	
   
	@Autowired
	public EmployeeDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insertEmployee(Employee e) {
		System.out.println(sessionFactory);
		session=sessionFactory.openSession();
		t=session.beginTransaction();
	     session.persist(e);
		
		t.commit();
		
		session.close();
		System.out.println("data inserted sucessfully.");
	}

	public SessionFactory getSession() {
		return sessionFactory;
	}

	public void setSession(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ArrayList<Employee> fetchAll() {
		session=sessionFactory.openSession();
		t=session.beginTransaction();
		Query query= session.createQuery("from Employee");
		ArrayList<Employee> emplist=(ArrayList<Employee>) query.list();
	return emplist;
		
	}

	@Override
	public Employee fetchSpecific(int id) {
		session=sessionFactory.openSession();
	t=session.beginTransaction();// TODO Auto-generated method stub
	Employee e=session.get(Employee.class,id);
		return e;
	}
	
	

}
