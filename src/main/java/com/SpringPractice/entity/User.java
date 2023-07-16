package com.SpringPractice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String userName;

	private String userCity;

	private String userQualification;

	private Integer userSalary;

	private Integer userAge;

	public User() {
		super();
	}

	public User(Integer userId, String userName, String userCity, String userQualification, Integer userSalary,
			Integer userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCity = userCity;
		this.userQualification = userQualification;
		this.userSalary = userSalary;
		this.userAge = userAge;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserQualification() {
		return userQualification;
	}

	public void setUserQualification(String userQualification) {
		this.userQualification = userQualification;
	}

	public Integer getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(Integer userSalary) {
		this.userSalary = userSalary;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	
	

}
