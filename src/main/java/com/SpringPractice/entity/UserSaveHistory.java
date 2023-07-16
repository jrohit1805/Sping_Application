package com.SpringPractice.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserSaveHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer historyId;
	
	private String userName;
	private String userQualification;
	private Date historyTime;
	private Integer userAge;
	
	
	public UserSaveHistory() {
		super();
	}


	public UserSaveHistory(Integer historyId, String userName, String userQualification, Date historyTime, Integer userAge) {
		super();
		this.historyId = historyId;
		this.userName = userName;
		this.userQualification = userQualification;
		this.historyTime = historyTime;
		this.userAge=userAge;
	}


	public Integer getHistoryId() {
		return historyId;
	}


	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserQualification() {
		return userQualification;
	}


	public void setUserQualification(String userQualification) {
		this.userQualification = userQualification;
	}


	public Date getHistoryTime() {
		return historyTime;
	}


	public void setHistoryTime(Date historyTime) {
		this.historyTime = historyTime;
	}


	public Integer getUserAge() {
		return userAge;
	}


	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	
	
}
