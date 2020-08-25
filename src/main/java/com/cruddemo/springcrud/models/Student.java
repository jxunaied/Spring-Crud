package com.cruddemo.springcrud.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	
	@Id
	private Integer Id;
	private String fullName;
	private String address;
	private String phoneNo;
	private String updatedBy;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedOn;
	
	public Student() {
		
	}
	
	public Student(Integer Id, String fullName, String address, String phoneNo, String updatedBy, Date updatedOn) {
		super();
		this.Id = Id;
		this.fullName = fullName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
	

}
