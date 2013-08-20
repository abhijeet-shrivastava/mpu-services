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
@Table(name="mcp_work_payment_detail")
public class McpWorkPaymentDetailtlEntity {
	
	
	@Id
	@GeneratedValue
	@Column(name="payment_id")
	private  int paymentId;
	
	//Many Items to One Order
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "work_id")
	private McpWorkEntity work;
	
	public McpWorkEntity getWork() {
		return work;
	}
	public void setWork(McpWorkEntity work) {
		this.work = work;
	}
	private String paymentAccountNumber;
	private BigDecimal paymentAmount;
	private Character paymentStatus;
	
	private Character paymentTypeCode;
	private Timestamp paymentDate;
	private String paymentExpirationDate;
	
	

	
	
	public String getPaymentAccountNumber() {
		return paymentAccountNumber;
	}
	public void setPaymentAccountNumber(String paymentAccountNumber) {
		this.paymentAccountNumber = paymentAccountNumber;
	}
	
	/**
	 * @return the paymentAmount
	 */
	public BigDecimal getPaymentAmount() {
		return this.paymentAmount;
	}
	/**
	 * @param paymentAmount the paymentAmount to set
	 */
	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	/**
	 * @return the paymentExpirationDate
	 */
	public String getPaymentExpirationDate() {
		return this.paymentExpirationDate;
	}
	/**
	 * @param paymentExpirationDate the paymentExpirationDate to set
	 */
	public void setPaymentExpirationDate(String paymentExpirationDate) {
		this.paymentExpirationDate = paymentExpirationDate;
	}
	public Character getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(Character paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public Character getPaymentTypeCode() {
		return paymentTypeCode;
	}
	public void setPaymentTypeCode(Character paymentTypeCode) {
		this.paymentTypeCode = paymentTypeCode;
	}
	public Timestamp getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
}
