    package com.EmployeeRegistrationUsingHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "UserDetails")
public class EmployeeDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId ;
	private String firstName;
	private String lastName;   
    @OneToOne(mappedBy ="detail")
	private Employee user;
	
	public EmployeeDetail(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public EmployeeDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Employee getUser() {
		return user;
	}

	public void setUser(Employee user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDetail [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName +"+]";
	}

	

}
