package com.sears.mpu.backoffice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="work_event")
public class McpWorkEventEntity {
	
	@Id
	@Column(name="work_event_id")
	private int workflowEventId;
	//One Event can have many work action 
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkItemActionDetailEntity.class)
	@JoinColumn(name = "work_event_id")
	private List<McpWorkItemActionDetailEntity> mcpWorkActionDetailEntity;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkflowTypeEntity.class)
	@JoinColumn(name = "workflow_type_id")
	private McpWorkflowTypeEntity mcpWorkflowTypeEntity;
	
	
	private int workEventServiceLevel;
	private String workEventTargetItem;
	private String workEventTargetOrder;
	private String workEventActionName;
	
	/**
	 * @return the workflowEventId
	 */
	public int getWorkflowEventId() {
		return workflowEventId;
	}
	/**
	 * @param workflowEventId the workflowEventId to set
	 */
	public void setWorkflowEventId(int workflowEventId) {
		this.workflowEventId = workflowEventId;
	}
	/**
	 * @return the workEventServiceLevel
	 */
	public int getWorkEventServiceLevel() {
		return workEventServiceLevel;
	}
	/**
	 * @param workEventServiceLevel the workEventServiceLevel to set
	 */
	public void setWorkEventServiceLevel(int workEventServiceLevel) {
		this.workEventServiceLevel = workEventServiceLevel;
	}
	/**
	 * @return the workEventTargetItem
	 */
	public String getWorkEventTargetItem() {
		return workEventTargetItem;
	}
	/**
	 * @param workEventTargetItem the workEventTargetItem to set
	 */
	public void setWorkEventTargetItem(String workEventTargetItem) {
		this.workEventTargetItem = workEventTargetItem;
	}
	/**
	 * @return the workEventTargetOrder
	 */
	public String getWorkEventTargetOrder() {
		return workEventTargetOrder;
	}
	/**
	 * @param workEventTargetOrder the workEventTargetOrder to set
	 */
	public void setWorkEventTargetOrder(String workEventTargetOrder) {
		this.workEventTargetOrder = workEventTargetOrder;
	}
	/**
	 * @return the workEventActionId
	 */
	public String getWorkEventActionName() {
		return workEventActionName;
	}
	/**
	 * @param workEventActionId the workEventActionId to set
	 */
	public void setWorkEventActionId(String workEventActionId) {
		this.workEventActionName = workEventActionName;
	}
	/**
	 * @return the mcpWorkActionDetailEntity
	 */
	public List<McpWorkItemActionDetailEntity> getMcpWorkActionDetailEntity() {
		return mcpWorkActionDetailEntity;
	}
	/**
	 * @param mcpWorkActionDetailEntity the mcpWorkActionDetailEntity to set
	 */
	public void setMcpWorkActionDetailEntity(
			List<McpWorkItemActionDetailEntity> mcpWorkActionDetailEntity) {
		this.mcpWorkActionDetailEntity = mcpWorkActionDetailEntity;
	}
	public McpWorkflowTypeEntity getMcpWorkflowTypeEntity() {
		return mcpWorkflowTypeEntity;
	}
	public void setMcpWorkflowTypeEntity(McpWorkflowTypeEntity mcpWorkflowTypeEntity) {
		this.mcpWorkflowTypeEntity = mcpWorkflowTypeEntity;
	}
	public void setWorkEventActionName(String workEventActionName) {
		this.workEventActionName = workEventActionName;
	}
}
