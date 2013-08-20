package com.sears.mpu.backoffice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="mcp_workflow_type")
public class McpWorkflowTypeEntity {
	
	@Id
	@Column(name="workflow_type_id")
	
	private int workflowTypeId; 
	private String workflowTypeCd;
	private String workflowTypeQueue;
	private String workflowTypeFormat;
	private String workflowTypeDescription;

	
	//One Work flow can have many work event 
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEventEntity.class)
	@JoinColumn(name = "workflow_type_id")
	private List<McpWorkEventEntity> workEventEntity;
	
	/**
	 * @return the workflowTypeId
	 */
	public int getWorkflowTypeId() {
		return workflowTypeId;
	}
	/**
	 * @param workflowTypeId the workflowTypeId to set
	 */
	public void setWorkflowTypeId(int workflowTypeId) {
		this.workflowTypeId = workflowTypeId;
	}
	/**
	 * @return the workflowTypeCd
	 */
	public String getWorkflowTypeCd() {
		return workflowTypeCd;
	}
	/**
	 * @param workflowTypeCd the workflowTypeCd to set
	 */
	public void setWorkflowTypeCd(String workflowTypeCd) {
		this.workflowTypeCd = workflowTypeCd;
	}
	/**
	 * @return the workflowTypeQueue
	 */
	public String getWorkflowTypeQueue() {
		return workflowTypeQueue;
	}
	/**
	 * @param workflowTypeQueue the workflowTypeQueue to set
	 */
	public void setWorkflowTypeQueue(String workflowTypeQueue) {
		this.workflowTypeQueue = workflowTypeQueue;
	}
	/**
	 * @return the workflowTypeFormat
	 */
	public String getWorkflowTypeFormat() {
		return workflowTypeFormat;
	}
	/**
	 * @param workflowTypeFormat the workflowTypeFormat to set
	 */
	public void setWorkflowTypeFormat(String workflowTypeFormat) {
		this.workflowTypeFormat = workflowTypeFormat;
	}
	/**
	 * @return the workflowTypeDescription
	 */
	public String getWorkflowTypeDescription() {
		return workflowTypeDescription;
	}
	/**
	 * @param workflowTypeDescription the workflowTypeDescription to set
	 */
	public void setWorkflowTypeDescription(String workflowTypeDescription) {
		this.workflowTypeDescription = workflowTypeDescription;
	}

	/**
	 * @return the workEventEntity
	 */
	public List<McpWorkEventEntity> getWorkEventEntity() {
		return workEventEntity;
	}
	/**
	 * @param workEventEntity the workEventEntity to set
	 */
	public void setWorkEventEntity(List<McpWorkEventEntity> workEventEntity) {
		this.workEventEntity = workEventEntity;
	}
	

	
}
