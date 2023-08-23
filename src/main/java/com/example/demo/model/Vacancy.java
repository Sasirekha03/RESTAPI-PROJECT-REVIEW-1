package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vacancy {
	
	@Id
	private int id;
	private String companyName;
	private String location;
	private String role;
	private String jobType;
	private String workMode;
	private String education;
	public Vacancy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vacancy(int id, String companyName, String location, String role, String jobType, String workMode,
			String education) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.location = location;
		this.role = role;
		this.jobType = jobType;
		this.workMode = workMode;
		this.education = education;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getWorkMode() {
		return workMode;
	}
	public void setWorkMode(String workMode) {
		this.workMode = workMode;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
	
	

}
