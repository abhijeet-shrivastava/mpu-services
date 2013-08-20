package com.sears.mpu.backoffice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="work_event_resolution")
public class WorkEventResolutionEntity {

	@Id
	@Column(name="resolution_id")
	private int resolutionId;
	//Many Event Resolutions to one work event
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEventEntity.class)
	@JoinColumn(name = "workflow_event_id")
	private McpWorkEventEntity workEventEntity;
	
	private String resolutionCd;
	private String resolutionDescription;
	private int resolutionSeq;
	
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private McpWorkItemActionDetailEntity mcpWorkActionDetailEntity;
	
	public int getResolutionId() {
		return resolutionId;
	}
	public void setResolutionId(int resolutionId) {
		this.resolutionId = resolutionId;
	}

	public String getResolutionCd() {
		return resolutionCd;
	}
	public void setResolutionCd(String resolutionCd) {
		this.resolutionCd = resolutionCd;
	}
	public String getResolutionDescription() {
		return resolutionDescription;
	}
	public void setResolutionDescription(String resolutionDescription) {
		this.resolutionDescription = resolutionDescription;
	}
	public int getResolutionSeq() {
		return resolutionSeq;
	}
	/**
	 * @return the workEventEntity
	 */
	public McpWorkEventEntity getWorkEventEntity() {
		return workEventEntity;
	}
	/**
	 * @param workEventEntity the workEventEntity to set
	 */
	public void setWorkEventEntity(McpWorkEventEntity workEventEntity) {
		this.workEventEntity = workEventEntity;
	}
	/**
	 * @param resolutionSeq the resolutionSeq to set
	 */
	public void setResolutionSeq(int resolutionSeq) {
		this.resolutionSeq = resolutionSeq;
	}
	/**
	 * @return the mcpWorkActionDetailEntity
	 */
	public McpWorkItemActionDetailEntity getMcpWorkActionDetailEntity() {
		return mcpWorkActionDetailEntity;
	}
	/**
	 * @param mcpWorkActionDetailEntity the mcpWorkActionDetailEntity to set
	 */
	public void setMcpWorkActionDetailEntity(
			McpWorkItemActionDetailEntity mcpWorkActionDetailEntity) {
		this.mcpWorkActionDetailEntity = mcpWorkActionDetailEntity;
	}
	
}
