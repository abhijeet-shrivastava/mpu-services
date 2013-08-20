package com.sears.mpu.backoffice.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Nov 27, 2012
 * @author ssingh6
 *
 */
@Entity
@Table(name="mcp_package_item")
public class McpPackageItemEntity {
	@Id
	@GeneratedValue
	private int packageItemId;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "work_id")
	private McpWorkEntity work;
	private String mcpWorkItemId;
	private String workItemIdentifiers;
	private String workItemType;
	private Integer workItemOriginalQuantity;
	private String workItemImageUrl;
	private String workItemTransactionTypeCode;
	private String workItemAssignedId;
	private String workItemCreatedId;
	private Timestamp workItemCreatedTs;
	private Timestamp workItemUpdatedTs;
	private int workItemSequenceNumber;
	/**
	 * @return the package_item_id
	 */
	public int getPackageItemId() {
		return this.packageItemId;
	}
	/**
	 * @param package_item_id the package_item_id to set
	 */
	public void setPackageItemId(int packageItemId) {
		this.packageItemId = packageItemId;
	}
	/**
	 * @return the work
	 */
	public McpWorkEntity getWork() {
		return this.work;
	}
	/**
	 * @param work the work to set
	 */
	public void setWork(McpWorkEntity work) {
		this.work = work;
	}
	/**
	 * @return the mcpWorkItemId
	 */
	public String getMcpWorkItemId() {
		return this.mcpWorkItemId;
	}
	/**
	 * @param mcpWorkItemId the mcpWorkItemId to set
	 */
	public void setMcpWorkItemId(String mcpWorkItemId) {
		this.mcpWorkItemId = mcpWorkItemId;
	}
	/**
	 * @return the workItemIdentifiers
	 */
	public String getWorkItemIdentifiers() {
		return this.workItemIdentifiers;
	}
	/**
	 * @param workItemIdentifiers the workItemIdentifiers to set
	 */
	public void setWorkItemIdentifiers(String workItemIdentifiers) {
		this.workItemIdentifiers = workItemIdentifiers;
	}
	/**
	 * @return the workItemType
	 */
	public String getWorkItemType() {
		return this.workItemType;
	}
	/**
	 * @param workItemType the workItemType to set
	 */
	public void setWorkItemType(String workItemType) {
		this.workItemType = workItemType;
	}
	/**
	 * @return the workItemOriginalQuantity
	 */
	public Integer getWorkItemOriginalQuantity() {
		return this.workItemOriginalQuantity;
	}
	/**
	 * @param workItemOriginalQuantity the workItemOriginalQuantity to set
	 */
	public void setWorkItemOriginalQuantity(Integer workItemOriginalQuantity) {
		this.workItemOriginalQuantity = workItemOriginalQuantity;
	}
	/**
	 * @return the workItemImageUrl
	 */
	public String getWorkItemImageUrl() {
		return this.workItemImageUrl;
	}
	/**
	 * @param workItemImageUrl the workItemImageUrl to set
	 */
	public void setWorkItemImageUrl(String workItemImageUrl) {
		this.workItemImageUrl = workItemImageUrl;
	}
	/**
	 * @return the workItemTransactionTypeCode
	 */
	public String getWorkItemTransactionTypeCode() {
		return this.workItemTransactionTypeCode;
	}
	/**
	 * @param workItemTransactionTypeCode the workItemTransactionTypeCode to set
	 */
	public void setWorkItemTransactionTypeCode(String workItemTransactionTypeCode) {
		this.workItemTransactionTypeCode = workItemTransactionTypeCode;
	}
	/**
	 * @return the workItemAssignedId
	 */
	public String getWorkItemAssignedId() {
		return this.workItemAssignedId;
	}
	/**
	 * @param workItemAssignedId the workItemAssignedId to set
	 */
	public void setWorkItemAssignedId(String workItemAssignedId) {
		this.workItemAssignedId = workItemAssignedId;
	}
	/**
	 * @return the workItemCreatedId
	 */
	public String getWorkItemCreatedId() {
		return this.workItemCreatedId;
	}
	/**
	 * @param workItemCreatedId the workItemCreatedId to set
	 */
	public void setWorkItemCreatedId(String workItemCreatedId) {
		this.workItemCreatedId = workItemCreatedId;
	}
	/**
	 * @return the workItemCreatedTs
	 */
	public Timestamp getWorkItemCreatedTs() {
		return this.workItemCreatedTs;
	}
	/**
	 * @param workItemCreatedTs the workItemCreatedTs to set
	 */
	public void setWorkItemCreatedTs(Timestamp workItemCreatedTs) {
		this.workItemCreatedTs = workItemCreatedTs;
	}
	/**
	 * @return the workItemUpdatedTs
	 */
	public Timestamp getWorkItemUpdatedTs() {
		return this.workItemUpdatedTs;
	}
	/**
	 * @param workItemUpdatedTs the workItemUpdatedTs to set
	 */
	public void setWorkItemUpdatedTs(Timestamp workItemUpdatedTs) {
		this.workItemUpdatedTs = workItemUpdatedTs;
	}
	/**
	 * @return workItemSequenceNumber
	 * int
	 */
	public int getWorkItemSequenceNumber() {
		return workItemSequenceNumber;
	}
	/**
	 * @param workItemSequenceNumber 
	 * void
	 */
	public void setWorkItemSequenceNumber(int workItemSequenceNumber) {
		this.workItemSequenceNumber = workItemSequenceNumber;
	}	
}