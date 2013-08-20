package com.sears.mpu.backoffice.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="mcp_work")
public class McpWorkEntity {
	
	@Id
	@GeneratedValue
	@Column(name="work_id")
	private int workId;
	
	private String storeNo;
	private String storeType;
	private String workOrderIdentifier;
	private String workOrderOrigIdentifier;
	private int workflowTypeId;
	private String assigned;
	private String workOrderIdentifierTypeId;
	private String workStatus;
	private Timestamp workCreatedTs;
	private Timestamp workUpdatedTs;
	private String workAssignedId;
	private Integer layawayPackages;
	private String  kioskName;
	private String pickupType;
	
	public String getPickupType() {
		return pickupType;
	}
	public void setPickupType(String pickupType) {
		this.pickupType = pickupType;
	}
	//order contains many work identifiers
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkIdentifierEntity.class)
	@JoinColumn(name = "work_id" )
	private List<McpWorkIdentifierEntity> workIdentifiers;
	
	//order contains many items
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkItemEntity.class)
	@JoinColumn(name = "work_id")
	private List<McpWorkItemEntity> items;
	
	//order contains many package items
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpPackageItemEntity.class)
	@JoinColumn(name = "work_id")
	private List<McpPackageItemEntity> packageItems;
		
	//order contains many packages
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkPackageEntity.class)
	@JoinColumn(name = "work_id")
	private List<McpWorkPackageEntity> packages;
	
	//order represented by one blob
	@OneToOne(mappedBy="work",cascade = CascadeType.ALL)
	private McpWorkBlobEntity blob;

	@OneToOne(mappedBy="work",cascade=CascadeType.ALL)
	private McpTaskEntity mcpTask;

	@OneToOne(mappedBy="work",cascade=CascadeType.ALL)
	private McpTransactionEntity mcpTransactionEntity;

	//order contains many payments
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkPaymentDetailtlEntity.class)
    @JoinColumn(name = "work_id")
    private List<McpWorkPaymentDetailtlEntity> paymentList;

	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public Timestamp getWorkCreatedTs() {
		return workCreatedTs;
	}
	public void setWorkCreatedTs(Timestamp workCreatedTs) {
		this.workCreatedTs = workCreatedTs;
	}
	public Timestamp getWorkUpdatedTs() {
		return workUpdatedTs;
	}
	public void setWorkUpdatedTs(Timestamp workUpdatedTs) {
		this.workUpdatedTs = workUpdatedTs;
	}
	/**
	 * @return the workId
	 */
	public int getWorkId() {
		return workId;
	}
	/**
	 * @param workId the workId to set
	 */
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	/**
	 * @return the storeNo
	 */
	public String getStoreNo() {
		return storeNo;
	}
	/**
	 * @param storeNo the storeNo to set
	 */
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}
	/**
	 * @return the workOrderIdentifier
	 */
	public String getWorkOrderIdentifier() {
		return workOrderIdentifier;
	}
	/**
	 * @param workOrderIdentifier the workOrderIdentifier to set
	 */
	public void setWorkOrderIdentifier(String workOrderIdentifier) {
		this.workOrderIdentifier = workOrderIdentifier;
	}
	
	public String getWorkOrderOrigIdentifier() {
		return workOrderOrigIdentifier;
	}
	public void setWorkOrderOrigIdentifier(String workOrderOrigIdentifier) {
		this.workOrderOrigIdentifier = workOrderOrigIdentifier;
	}
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
	 * @return the assigned
	 */
	public String getAssigned() {
		return assigned;
	}
	/**
	 * @param assigned the assigned to set
	 */
	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}
	/**
	 * @return the workOrderIdentifierTypeId
	 */
	public String getWorkOrderIdentifierTypeId() {
		return workOrderIdentifierTypeId;
	}
	/**
	 * @param workOrderIdentifierTypeId the workOrderIdentifierTypeId to set
	 */
	public void setWorkOrderIdentifierTypeId(String workOrderIdentifierTypeId) {
		this.workOrderIdentifierTypeId = workOrderIdentifierTypeId;
	}
	/**
	 * @return the workIdentifiers
	 */
	public List<McpWorkIdentifierEntity> getWorkIdentifiers() {
		return workIdentifiers;
	}
	/**
	 * @param workIdentifiers the workIdentifiers to set
	 */
	public void setWorkIdentifiers(List<McpWorkIdentifierEntity> workIdentifiers) {
		this.workIdentifiers = workIdentifiers;
	}
	/**
	 * @return the items
	 */
	public List<McpWorkItemEntity> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<McpWorkItemEntity> items) {
		this.items = items;
	}
	/**
	 * @return the blob
	 */
	public McpWorkBlobEntity getBlob() {
		return blob;
	}
	/**
	 * @param blob the blob to set
	 */
	public void setBlob(McpWorkBlobEntity blob) {
		this.blob = blob;
	}
	public String getStoreType() {
		return storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
	public McpTaskEntity getMcpTask() {
		return mcpTask;
	}
	public void setMcpTask(McpTaskEntity mcpTask) {
		this.mcpTask = mcpTask;
	}
	/**
	 * @return the workAssignedId
	 */
	public String getWorkAssignedId() {
		return workAssignedId;
	}
	/**
	 * @param workAssignedId the workAssignedId to set
	 */
	public void setWorkAssignedId(String workAssignedId) {
		this.workAssignedId = workAssignedId;
	}
	/**
	 * @return the mcpTransactionEntity
	 */
	public McpTransactionEntity getMcpTransactionEntity() {
		return mcpTransactionEntity;
	}
	/**
	 * @param mcpTransactionEntity the mcpTransactionEntity to set
	 */
	public void setMcpTransactionEntity(McpTransactionEntity mcpTransactionEntity) {
		this.mcpTransactionEntity = mcpTransactionEntity;
	}
	/**
	 * @return the layawayPackages
	 */
	public Integer getLayawayPackages() {
		return this.layawayPackages;
	}
	/**
	 * @param layawayPackages the layawayPackages to set
	 */
	public void setLayawayPackages(Integer layawayPackages) {
		this.layawayPackages = layawayPackages;
	}
	/**
	 * @return the packageItems
	 */
	public List<McpPackageItemEntity> getPackageItems() {
		return this.packageItems;
	}
	/**
	 * @param packageItems the packageItems to set
	 */
	public void setPackageItems(List<McpPackageItemEntity> packageItems) {
		this.packageItems = packageItems;
	}
	/**
	 * @return the packages
	 */
	public List<McpWorkPackageEntity> getPackages() {
		return this.packages;
	}
	/**
	 * @param packages the packages to set
	 */
	public void setPackages(List<McpWorkPackageEntity> packages) {
		this.packages = packages;
	}
	/**
	 * @return the paymentList
	 */
	public List<McpWorkPaymentDetailtlEntity> getPaymentList() {
		return this.paymentList;
	}
	/**
	 * @param paymentList the paymentList to set
	 */
	public void setPaymentList(List<McpWorkPaymentDetailtlEntity> paymentList) {
		this.paymentList = paymentList;
	}
	public String getKioskName() {
		return kioskName;
	}
	public void setKioskName(String kioskName) {
		this.kioskName = kioskName;
	}
	
	
}
