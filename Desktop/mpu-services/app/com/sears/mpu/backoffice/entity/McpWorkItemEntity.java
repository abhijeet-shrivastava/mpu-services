package com.sears.mpu.backoffice.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mcp_work_item")

public class McpWorkItemEntity {
	
	@Id
	@GeneratedValue
	private int workItemId;
	//Many Items to One Order
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "work_id")
	private McpWorkEntity work;
		
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkItemReductionEntity.class)
    @JoinColumn(name = "work_item_id")
    private List<McpWorkItemReductionEntity> mcpWorkReductionEntityList;
	
	//One work item per may action 
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkItemActionDetailEntity.class)
	@JoinColumn(name = "work_item_id")
	private List<McpWorkItemActionDetailEntity> mcpWorkActionDetailEntity;
	private String workResolutionKey;
	private int workflowTemplateEventId;
	private Timestamp workItemCreatedTs;
	private String mcpWorkItemId;
	private String workItemIdentifiers;	
	private String workItemStatus;
	private int workItemPriority;
	private String workItemAssigned;
	private Timestamp workItemUpdatedTs;
	private String workItemType;
	private int workItemActiveActionId;
	private String workItemTypeQueue;
	private int workItemOriginalQuantity;
	private int workItemNewQuantity;
	private String workItemLocation;
	private String workItemImageUrl;
	private String workItemDeliveryTypeCode;
	private String workItemTransactionTypeCode;
	private String workItemAssignedId;
	private String workItemBinNumber;
	private int workItemReqQuantity;
	private char workItemStockState;
	private boolean workItemIsHighValue;
	private int workItemSequenceNumber;
	private String reasonCode;
	private String refundEligibilityCode;
	private BigDecimal itemRefundAmount;
	private BigDecimal itemTaxAmount;
	private int scannedItemCount;

	public boolean getWorkItemIsHighValue() {
		return workItemIsHighValue;
	}
	
	public void setWorkItemIsHighValue(boolean workItemIsHighValue) {
		this.workItemIsHighValue = workItemIsHighValue;
	}
	
	public int getWorkItemReqQuantity() {
		return workItemReqQuantity;
	}
	public void setWorkItemReqQuantity(int workItemReqQuantity) {
		this.workItemReqQuantity = workItemReqQuantity;
	}
	/**
	 * @return the work
	 */
	public McpWorkEntity getWork() {
		return work;
	}
	/**
	 * @param work the work to set
	 */
	public void setWork(McpWorkEntity work) {
		this.work = work;
	}
	
	/**
	 * @return the workItemId
	 */
	public int getWorkItemId() {
		return workItemId;
	}
	/**
	 * @param workItemId the workItemId to set
	 */
	public void setWorkItemId(int workItemId) {
		this.workItemId = workItemId;
	}

	/**
	 * @return the workResolution
	 */
	//public WorkResolutionEntity getWorkResolution() {
	//	return workResolution;
	//}
	/**
	 * @param workResolution the workResolution to set
	 */
	//public void setWorkResolution(WorkResolutionEntity workResolution) {
	//	this.workResolution = workResolution;
	//}
	/**
	 * @return the workResolutionKey
	 */
	public String getWorkResolutionKey() {
		return workResolutionKey;
	}
	/**
	 * @param workResolutionKey the workResolutionKey to set
	 */
	public void setWorkResolutionKey(String workResolutionKey) {
		this.workResolutionKey = workResolutionKey;
	}
	/**
	 * @return the workflowTemplateEventId
	 */
	public long getWorkflowTemplateEventId() {
		return workflowTemplateEventId;
	}
	/**
	 * @param workflowTemplateEventId the workflowTemplateEventId to set
	 */
	public void setWorkflowTemplateEventId(int workflowTemplateEventId) {
		this.workflowTemplateEventId = workflowTemplateEventId;
	}
	/**
	 * @return the workItemIdentifiers
	 */
	public String getWorkItemIdentifiers() {
		return workItemIdentifiers;
	}
	/**
	 * @param workItemIdentifiers the workItemIdentifiers to set
	 */
	public void setWorkItemIdentifiers(String workItemIdentifiers) {
		this.workItemIdentifiers = workItemIdentifiers;
	}
	
	public Timestamp getWorkItemCreatedTs() {
		return workItemCreatedTs;
	}
	public void setWorkItemCreatedTs(Timestamp workItemCreatedTs) {
		this.workItemCreatedTs = workItemCreatedTs;
	}
	public String getWorkItemStatus() {
		return workItemStatus;
	}
	public void setWorkItemStatus(String workItemStatus) {
		this.workItemStatus = workItemStatus;
	}
	public int getWorkItemPriority() {
		return workItemPriority;
	}
	public void setWorkItemPriority(int workItemPriority) {
		this.workItemPriority = workItemPriority;
	}
	public String getWorkItemAssigned() {
		return workItemAssigned;
	}
	public void setWorkItemAssigned(String workItemAssigned) {
		this.workItemAssigned = workItemAssigned;
	}
	public Timestamp getWorkItemUpdatedTs() {
		return workItemUpdatedTs;
	}
	public void setWorkItemUpdatedTs(Timestamp workItemUpdatedTs) {
		this.workItemUpdatedTs = workItemUpdatedTs;
	}
	public String getWorkItemType() {
		return workItemType;
	}
	public void setWorkItemType(String workItemType) {
		this.workItemType = workItemType;
	}
	/**
	 * @return the workItemActiveActionId
	 */
	public int getWorkItemActiveActionId() {
		return workItemActiveActionId;
	}
	/**
	 * @param workItemActiveActionId the workItemActiveActionId to set
	 */
	public void setWorkItemActiveActionId(int workItemActiveActionId) {
		this.workItemActiveActionId = workItemActiveActionId;
	}
	/**
	 * @return the workItemTypeQueue
	 */
	public String getWorkItemTypeQueue() {
		return workItemTypeQueue;
	}
	/**
	 * @param workItemTypeQueue the workItemTypeQueue to set
	 */
	public void setWorkItemTypeQueue(String workItemTypeQueue) {
		this.workItemTypeQueue = workItemTypeQueue;
	}
	public int getWorkItemOriginalQuantity() {
		return workItemOriginalQuantity;
	}
	public void setWorkItemOriginalQuantity(int workItemOriginalQuantity) {
		this.workItemOriginalQuantity = workItemOriginalQuantity;
	}
	public int getWorkItemNewQuantity() {
		return workItemNewQuantity;
	}
	public void setWorkItemNewQuantity(int workItemNewQuantity) {
		this.workItemNewQuantity = workItemNewQuantity;
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
	/**
	 * @return the workItemLocation
	 */
	public String getWorkItemLocation() {
		return workItemLocation;
	}
	/**
	 * @param workItemLocation the workItemLocation to set
	 */
	public void setWorkItemLocation(String workItemLocation) {
		this.workItemLocation = workItemLocation;
	}
	/**
	 * @return the mcpWorkItemId
	 */
	public String getMcpWorkItemId() {
		return mcpWorkItemId;
	}
	/**
	 * @param mcpWorkItemId the mcpWorkItemId to set
	 */
	public void setMcpWorkItemId(String mcpWorkItemId) {
		this.mcpWorkItemId = mcpWorkItemId;
	}
	/**
	 * @return the setItemImageURL
	 */
	public String getWorkItemImageUrl() {
		return workItemImageUrl;
	}
	/**
	 * @param setItemImageURL the setItemImageURL to set
	 */
	public void setWorkItemImageUrl(String workItemImageUrl) {
		this.workItemImageUrl = workItemImageUrl;
	}
	/**
	 * @return the workItemDeliveryTypeCode
	 */
	public String getWorkItemDeliveryTypeCode() {
		return workItemDeliveryTypeCode;
	}
	/**
	 * @return the workItemTransactionTypeCode
	 */
	public String getWorkItemTransactionTypeCode() {
		return workItemTransactionTypeCode;
	}
	/**
	 * @param workItemDeliveryTypeCode the workItemDeliveryTypeCode to set
	 */
	public void setWorkItemDeliveryTypeCode(String workItemDeliveryTypeCode) {
		this.workItemDeliveryTypeCode = workItemDeliveryTypeCode;
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
		return workItemAssignedId;
	}
	/**
	 * @param workItemAssignedId the workItemAssignedId to set
	 */
	public void setWorkItemAssignedId(String workItemAssignedId) {
		this.workItemAssignedId = workItemAssignedId;
	}
	/**
	 * @return the workItemBinNumber
	 */
	public String getWorkItemBinNumber() {
		return this.workItemBinNumber;
	}
	/**
	 * @param workItemBinNumber the workItemBinNumber to set
	 */
	public void setWorkItemBinNumber(String workItemBinNumber) {
		this.workItemBinNumber = workItemBinNumber;
	}
	/**
	 * @return the workItemStockState
	 */
	public char getWorkItemStockState() {
		return workItemStockState;
	}
	/**
	 * @param workItemStockState the workItemStockState to set
	 */
	public void setWorkItemStockState(char workItemStockState) {
		this.workItemStockState = workItemStockState;
	}

	/**
	 * @return the workItemSequenceNumber
	 */
	public int getWorkItemSequenceNumber() {
		return workItemSequenceNumber;
	}

	/**
	 * @param workItemSequenceNumber the workItemSequenceNumber to set
	 */
	public void setWorkItemSequenceNumber(int workItemSequenceNumber) {
		this.workItemSequenceNumber = workItemSequenceNumber;
	}

	/**
	 * @return the mcpWorkReductionEntityList
	 */
	public List<McpWorkItemReductionEntity> getMcpWorkReductionEntityList() {
		return this.mcpWorkReductionEntityList;
	}

	/**
	 * @param mcpWorkReductionEntityList the mcpWorkReductionEntityList to set
	 */
	public void setMcpWorkReductionEntityList(
			List<McpWorkItemReductionEntity> mcpWorkReductionEntityList) {
		this.mcpWorkReductionEntityList = mcpWorkReductionEntityList;
	}

	/**
	 * @return the reasonCode
	 */
	public String getReasonCode() {
		return this.reasonCode;
	}

	/**
	 * @param reasonCode the reasonCode to set
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	/**
	 * @return the refundEligibilityCode
	 */
	public String getRefundEligibilityCode() {
		return this.refundEligibilityCode;
	}

	/**
	 * @param refundEligibilityCode the refundEligibilityCode to set
	 */
	public void setRefundEligibilityCode(String refundEligibilityCode) {
		this.refundEligibilityCode = refundEligibilityCode;
	}

	/**
	 * @return the itemRefundAmount
	 */
	public BigDecimal getItemRefundAmount() {
		return this.itemRefundAmount;
	}

	/**
	 * @param itemRefundAmount the itemRefundAmount to set
	 */
	public void setItemRefundAmount(BigDecimal itemRefundAmount) {
		this.itemRefundAmount = itemRefundAmount;
	}

	/**
	 * @return the itemTaxAmount
	 */
	public BigDecimal getItemTaxAmount() {
		return this.itemTaxAmount;
	}

	/**
	 * @param itemTaxAmount the itemTaxAmount to set
	 */
	public void setItemTaxAmount(BigDecimal itemTaxAmount) {
		this.itemTaxAmount = itemTaxAmount;
	}

	/**
	 * @return the scannedItemCount
	 */
	public int getScannedItemCount() {
		return this.scannedItemCount;
	}

	/**
	 * @param scannedItemCount the scannedItemCount to set
	 */
	public void setScannedItemCount(int scannedItemCount) {
		this.scannedItemCount = scannedItemCount;
	}	
}