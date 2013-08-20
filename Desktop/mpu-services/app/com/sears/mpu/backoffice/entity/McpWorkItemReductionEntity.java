package com.sears.mpu.backoffice.entity;

import java.math.BigDecimal;
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
@Table(name = "mcp_work_item_reduction_detail")
public class McpWorkItemReductionEntity {

	@Id
	@GeneratedValue
	@Column(name="reduction_id")
	private int reductionId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkItemEntity.class)
	@JoinColumn(name = "work_item_id")
	private McpWorkItemEntity workItem;
	
	private String reductionType; 
	private String reductionAccountNumber; 
	private BigDecimal reductionAmount; 
	private Timestamp reductionDate;
	private Character isMultiItemCoupon; 
	private int reductionQuantity;
	public int getReductionId() {
		return reductionId;
	}
	public void setReductionId(int reductionId) {
		this.reductionId = reductionId;
	}
	public McpWorkItemEntity getWorkItem() {
		return workItem;
	}
	public void setWorkItem(McpWorkItemEntity workItem) {
		this.workItem = workItem;
	}
	/**
	 * @return the reductionType
	 */
	public String getReductionType() {
		return this.reductionType;
	}
	/**
	 * @param reductionType the reductionType to set
	 */
	public void setReductionType(String reductionType) {
		this.reductionType = reductionType;
	}
	/**
	 * @return the reductionAccountNumber
	 */
	public String getReductionAccountNumber() {
		return this.reductionAccountNumber;
	}
	/**
	 * @param reductionAccountNumber the reductionAccountNumber to set
	 */
	public void setReductionAccountNumber(String reductionAccountNumber) {
		this.reductionAccountNumber = reductionAccountNumber;
	}
	/**
	 * @return the reductionAmount
	 */
	public BigDecimal getReductionAmount() {
		return this.reductionAmount;
	}
	/**
	 * @param reductionAmount the reductionAmount to set
	 */
	public void setReductionAmount(BigDecimal reductionAmount) {
		this.reductionAmount = reductionAmount;
	}
	/**
	 * @return the reductionDate
	 */
	public Timestamp getReductionDate() {
		return this.reductionDate;
	}
	/**
	 * @param reductionDate the reductionDate to set
	 */
	public void setReductionDate(Timestamp reductionDate) {
		this.reductionDate = reductionDate;
	}
	/**
	 * @return the isMultiItemCoupon
	 */
	public Character getIsMultiItemCoupon() {
		return this.isMultiItemCoupon;
	}
	/**
	 * @param isMultiItemCoupon the isMultiItemCoupon to set
	 */
	public void setIsMultiItemCoupon(Character isMultiItemCoupon) {
		this.isMultiItemCoupon = isMultiItemCoupon;
	}
	/**
	 * @return the reductionQuantity
	 */
	public int getReductionQuantity() {
		return this.reductionQuantity;
	}
	/**
	 * @param reductionQuantity the reductionQuantity to set
	 */
	public void setReductionQuantity(int reductionQuantity) {
		this.reductionQuantity = reductionQuantity;
	}		
}
