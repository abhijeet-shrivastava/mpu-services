package com.sears.mpu.backoffice.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ActiveUserId implements Serializable{
	
	public ActiveUserId(String userId) {
		this.userId = userId;
	}
	public ActiveUserId(String userId, Timestamp loggedInTime) {
		this.userId = userId;
		this.loggedInTime = loggedInTime;
	}
	public ActiveUserId() {
		
	}
	private static final long serialVersionUID = 1L;
	@Column(name = "user_id", insertable = false, updatable = false)
	private String userId ;
	@Column(name = "logged_in_time", insertable = false, updatable = false)
	private Timestamp loggedInTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Timestamp getLoggedInTime() {
		return loggedInTime;
	}
	public void setLoggedInTime(Timestamp loggedInTime) {
		this.loggedInTime = loggedInTime;
	}
	

}
