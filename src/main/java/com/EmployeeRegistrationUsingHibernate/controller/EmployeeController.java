package com.EmployeeRegistrationUsingHibernate.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EmployeeRegistrationUsingHibernate.entity.Employee;
import com.EmployeeRegistrationUsingHibernate.entity.EmployeeAddress;
import com.EmployeeRegistrationUsingHibernate.entity.EmployeeDetail;

public class EmployeeController {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 public void  employeeRegisterDetails() {
	  
	  Configuration config = new Configuration().configure("hibernate.cfg.xml");
	  SessionFactory sf = config.buildSessionFactory();
	  Session session = sf.openSession();
	   Employee user = new Employee();
	   user.setUserId(2); 
	   user.setUserPass("qwerty");
	  
	     
	   EmployeeDetail detail = new EmployeeDetail();
	   detail.setFirstName("A");
	   detail.setLastName("P");
	   detail.setUser(user);
	   user.setDetail(detail);
	   
	   
	   EmployeeAddress address = new EmployeeAddress();
	   address.setCity("snr");
	   address.setState("hp");
	   address.setPinCode("123");
	   session.save(address);
	   EmployeeAddress address2 = new EmployeeAddress();
	   address2.setCity("mandi");
	   address2.setState("hp");
	   address2.setPinCode("456");
	   session.save(address2);
	  List<EmployeeAddress> add=  new ArrayList<EmployeeAddress>();
	  add.add(address);
	  add.add(address2);
	  user.setAddresses(add);
	   
	  
	   Transaction tx = session.beginTransaction();
	   session.save(detail);
	   session.save(add);
	   session.save(user) ;
	   tx.commit();
	   
	   Employee user2= session.get(Employee.class ,2);
	   System.out.println(user2.getUserId());
	   System.out.println(user2.getDetail());
	  
} 
}



