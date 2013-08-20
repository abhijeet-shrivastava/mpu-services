package com.sears.mpu.backoffice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This entity represnts mcp_task table.
 * 
 * @author ssankay
 *
 */
@Entity
@Table(name="mcp_task")
public class McpTaskEntity implements Serializable{
	
	@Id 
	@GeneratedValue
	private int id;
	
	@Column(name="task_id",insertable=true,columnDefinition="STRING")
	private String taskId;  
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "work_id",columnDefinition="INT(11)")
	private McpWorkEntity work;
	
	private String publisher;
	
	private String targetPublisher;
	
	private String deviceName;
	
	private int taskType;
	
	private String acknowledgeMent;
	
	private Date expireTime;
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}


	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTargetPublisher() {
		return targetPublisher;
	}

	public void setTargetPublisher(String targetPublisher) {
		this.targetPublisher = targetPublisher;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getTaskType() {
		return taskType;
	}

	public void setTaskType(int taskType) {
		this.taskType = taskType;
	}

	public String getAcknowledgeMent() {
		return acknowledgeMent;
	}

	public void setAcknowledgeMent(String acknowledgeMent) {
		this.acknowledgeMent = acknowledgeMent;
	}

	public McpWorkEntity getWork() {
		return work;
	}

	public void setWork(McpWorkEntity work) {
		this.work = work;
	}

	public int getId() {
		return id;
	}

	/**
	 * @return the expireTime
	 */
	public Date getExpireTime() {
		return expireTime;
	}

	/**
	 * @param expireTime the expireTime to set
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public void setId(int id) {
		this.id = id;
	}
}
