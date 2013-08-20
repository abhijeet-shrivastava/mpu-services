package com.sears.mpu.backoffice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mod_notification_task")
public class ModNotificationTaskEntity {
	
	@Id
	@GeneratedValue
	@Column(name="mod_task_id")
	private int modTaskId;
	
	private String taskDescription;

	public int getModTaskId() {
		return modTaskId;
	}

	public void setModTaskId(int modTaskId) {
		this.modTaskId = modTaskId;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
}
