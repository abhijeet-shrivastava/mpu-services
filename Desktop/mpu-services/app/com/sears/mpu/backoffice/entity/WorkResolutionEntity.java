package com.sears.mpu.backoffice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class WorkResolutionEntity {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int workResolutionId;
	private String resolvingUrl;
	private String resolutionResult;
	private int mcpWorkItemId;
	
	/**
	 * @return the workResolutionId
	 */
	public int getWorkResolutionId() {
		return workResolutionId;
	}
	/**
	 * @param workResolutionId the workResolutionId to set
	 */
	public void setWorkResolutionId(int workResolutionId) {
		this.workResolutionId = workResolutionId;
	}
	/**
	 * @return the resolvingUrl
	 */
	public String getResolvingUrl() {
		return resolvingUrl;
	}
	/**
	 * @param resolvingUrl the resolvingUrl to set
	 */
	public void setResolvingUrl(String resolvingUrl) {
		this.resolvingUrl = resolvingUrl;
	}
	/**
	 * @return the resolutionResult
	 */
	public String getResolutionResult() {
		return resolutionResult;
	}
	/**
	 * @param resolutionResult the resolutionResult to set
	 */
	public void setResolutionResult(String resolutionResult) {
		this.resolutionResult = resolutionResult;
	}
	/**
	 * @return the mcpWorkItemId
	 */
	public long getMcpWorkItemId() {
		return mcpWorkItemId;
	}
	/**
	 * @param mcpWorkItemId the mcpWorkItemId to set
	 */
	public void setMcpWorkItemId(int mcpWorkItemId) {
		this.mcpWorkItemId = mcpWorkItemId;
	}

}
