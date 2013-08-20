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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mcp_work_item_action_detail")
public class McpWorkItemActionDetailEntity {

	@Id
	@GeneratedValue
	@Column(name="work_item_action_id")
	private int workItemActionId;
	private String workItemActionName;
	private Timestamp workItemActionCreatedTs;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEventEntity.class)
	@JoinColumn(name = "work_event_id")
	private McpWorkEventEntity mcpWorkEventEntity;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkItemEntity.class)
	@JoinColumn(name = "work_item_id")
	private McpWorkItemEntity workItem;
		

	private Timestamp workItemActionStartedTs;
	private Timestamp workItemActionEndedTs;
	private String workItemActionUserid;
	
	// this will be made into an entity.
	private int resolutionId;
	
	private int workItemOriginalQuantity;
	private int workItemNewQuantity;
	
	//One work action one resolution
	//order represented by one blob
	@OneToOne(mappedBy="mcpWorkActionDetailEntity",cascade = CascadeType.ALL)
	@JoinColumn(name = "resolution_id")
	private WorkEventResolutionEntity workEventResolutionEntity;
	
	public McpWorkEventEntity getMcpWorkEventEntity() {
		return mcpWorkEventEntity;
	}
	public void setMcpWorkEventEntity(McpWorkEventEntity mcpWorkEventEntity) {
		this.mcpWorkEventEntity = mcpWorkEventEntity;
	}
	public int getWorkItemActionId() {
		return workItemActionId;
	}
	public void setWorkItemActionId(int workItemActionId) {
		this.workItemActionId = workItemActionId;
	}
	public String getWorkItemActionName() {
		return workItemActionName;
	}
	public void setWorkItemActionName(String workItemActionName) {
		this.workItemActionName = workItemActionName;
	}
	public Timestamp getWorkItemActionCreatedTs() {
		return workItemActionCreatedTs;
	}
	public void setWorkItemActionCreatedTs(
			Timestamp workItemActionCreatedTs) {
		this.workItemActionCreatedTs = workItemActionCreatedTs;
	}
	public Timestamp getWorkItemActionStartedTs() {
		return workItemActionStartedTs;
	}
	public void setWorkItemActionStartedTs(
			Timestamp workItemActionStartedTs) {
		this.workItemActionStartedTs = workItemActionStartedTs;
	}
	public Timestamp getWorkItemActionEndedTs() {
		return workItemActionEndedTs;
	}
	public void setWorkItemActionEndedTs(Timestamp workItemActionEndedTs) {
		this.workItemActionEndedTs = workItemActionEndedTs;
	}
	public String getWorkItemActionUserid() {
		return workItemActionUserid;
	}
	public void setWorkItemActionUserid(String workItemActionUserid) {
		this.workItemActionUserid = workItemActionUserid;
	}

	// these wont be needed
	public int getResolutionId() {
		return resolutionId;
	}
	public void setResolutionId(int resolutionId) {
		this.resolutionId = resolutionId;
	}
	/**
	 * @return the workEventResolutionEntity
	 */
	public WorkEventResolutionEntity getWorkEventResolutionEntity() {
		return workEventResolutionEntity;
	}

	/**
	 * @param workEventResolutionEntity the workEventResolutionEntity to set
	 */
	public void setWorkEventResolutionEntity(
			WorkEventResolutionEntity workEventResolutionEntity) {
		this.workEventResolutionEntity = workEventResolutionEntity;
	}

	public McpWorkItemEntity getWorkItem() {
		return workItem;
	}
	public void setWorkItem(McpWorkItemEntity workItem) {
		this.workItem = workItem;
	}
	/**
	 * @return the workItemOriginalQty
	 */
	public int getWorkItemOriginalQty() {
		return workItemOriginalQuantity;
	}
	/**
	 * @param workItemOriginalQty the workItemOriginalQty to set
	 */
	public void setWorkItemOriginalQuantity(int workItemOriginalQuantity) {
		this.workItemOriginalQuantity = workItemOriginalQuantity;
	}
	/**
	 * @return the workItemNewQty
	 */
	public int getWorkItemNewQuantity() {
		return workItemNewQuantity;
	}
	/**
	 * @param workItemNewQty the workItemNewQty to set
	 */
	public void setWorkItemNewQuantity(int workItemNewQuantity) {
		this.workItemNewQuantity = workItemNewQuantity;
	}
}
