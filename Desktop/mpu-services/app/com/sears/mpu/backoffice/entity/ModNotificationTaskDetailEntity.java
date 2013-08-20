package com.sears.mpu.backoffice.entity;

import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mod_notification_task_detail")
public class ModNotificationTaskDetailEntity {
	@Id
	@GeneratedValue
	@Column(name="mod_task_det_id")
	private int modTaskDetId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = ModNotificationTaskEntity.class)
	@JoinColumn(name = "mod_task_id")
	private ModNotificationTaskEntity modNotificationTaskEntity; 
	
	private String modMessageDetail;
	
	private String storeNo;
	
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "mcp_work_id")
	private McpWorkEntity mcpWorkEntity;
	 
	private int mcpWorkItemId;

	private String userId;
	
	private Timestamp createdDate;
	
	private String updatedBy;
	
	private Timestamp updatedDate;

	public int getModTaskDetId() {
		return modTaskDetId;
	}

	public void setModTaskDetId(int modTaskDetId) {
		this.modTaskDetId = modTaskDetId;
	}

	public String getModMessageDetail() {
		return modMessageDetail;
	}

	public void setModMessageDetail(String modMessageDetail) {
		this.modMessageDetail = modMessageDetail;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public McpWorkEntity getMcpWorkEntity() {
		return mcpWorkEntity;
	}

	public void setMcpWorkEntity(McpWorkEntity mcpWorkEntity) {
		this.mcpWorkEntity = mcpWorkEntity;
	}

	public int getMcpWorkItemId() {
		return mcpWorkItemId;
	}

	public void setMcpWorkItemId(int mcpWorkItemId) {
		this.mcpWorkItemId = mcpWorkItemId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public ModNotificationTaskEntity getModNotificationTaskEntity() {
		return modNotificationTaskEntity;
	}

	public void setModNotificationTaskEntity(
			ModNotificationTaskEntity modNotificationTaskEntity) {
		this.modNotificationTaskEntity = modNotificationTaskEntity;
	}
}
