package com.registrationapp1.entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="student_data")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name", length=40, nullable=false)
	private String name;
	
	@Column(name="email", length=100, nullable=false, unique=true)
	private String email;
	
	@Column(name="dob", columnDefinition="date")
	private Date dob;
	
	@Column(name="city", length=50)
	private String city;
	
	@Column(name="mobile", nullable=false, unique=true)
	private long mobile;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}
