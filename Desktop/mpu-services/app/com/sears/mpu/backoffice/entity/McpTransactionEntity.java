package com.sears.mpu.backoffice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This entity represant mcp_transaction table.
 * 
 * @author rkumar9
 *
 */
@Entity
@Table(name="mcp_transaction")
public class McpTransactionEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue
	private int id;
	
	@Column(name="transaction_id",insertable=true,columnDefinition="STRING")
	private String transactionId;  
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "work_id",columnDefinition="INT(11)")
	private McpWorkEntity work;
	
	private String transactionType;
	private String transactionStatus;
	private String transactionCode;
	private Date transactionDate;
	private int transactionNumber;
	private int transactionRelaxedTransactionId;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	/**
	 * @return the work
	 */
	public McpWorkEntity getWork() {
		return work;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @return the transactionStatus
	 */
	public String getTransactionStatus() {
		return transactionStatus;
	}
	/**
	 * @return the transactionCode
	 */
	public String getTransactionCode() {
		return transactionCode;
	}
	/**
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @return the transactionNumber
	 */
	public int getTransactionNumber() {
		return transactionNumber;
	}
	/**
	 * @return the transactionRelaxedTransactionId
	 */
	public int getTransactionRelaxedTransactionId() {
		return transactionRelaxedTransactionId;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @param work the work to set
	 */
	public void setWork(McpWorkEntity work) {
		this.work = work;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	/**
	 * @param transactionCode the transactionCode to set
	 */
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	/**
	 * @param transactionNumber the transactionNumber to set
	 */
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	/**
	 * @param transactionRelaxedTransactionId the transactionRelaxedTransactionId to set
	 */
	public void setTransactionRelaxedTransactionId(int transactionRelaxedTransactionId) {
		this.transactionRelaxedTransactionId = transactionRelaxedTransactionId;
	}

	
}
