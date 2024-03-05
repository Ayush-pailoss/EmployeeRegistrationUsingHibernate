package com.EmployeeRegistrationUsingHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="UserAddress")
public class EmployeeAddress { 
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
   
	private String city;
	private String state;
	private String pinCode;	
	public EmployeeAddress(String city, String state, String pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserAddress [userId=" + userId + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
}
