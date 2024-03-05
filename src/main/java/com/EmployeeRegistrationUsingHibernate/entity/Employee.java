package com.EmployeeRegistrationUsingHibernate.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users") 
public class Employee {
	@Id
	private int userId;
	private String UserPass;
	@OneToOne
	private EmployeeDetail detail;
	@OneToMany
	private List<EmployeeAddress> addresses;
	
	
	
	
	



	public Employee(int userId, String userPass, EmployeeDetail detail, List<EmployeeAddress> addresses) {
		super();
		this.userId = userId;
		UserPass = userPass;
		this.detail = detail;
		this.addresses = addresses;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return UserPass;
	}
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}
	
	
	public List<EmployeeAddress> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<EmployeeAddress> addresses) {
		this.addresses = addresses;
	}



	public EmployeeDetail getDetail() {
		return detail;
	}
	public void setDetail(EmployeeDetail detail) {
		this.detail = detail;
	}
	
}
