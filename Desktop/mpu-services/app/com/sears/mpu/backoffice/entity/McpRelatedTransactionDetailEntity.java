package com.sears.mpu.backoffice.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mcp_related_transaction_detail")
public class McpRelatedTransactionDetailEntity {
	
	@Id
	@GeneratedValue
	@Column(name="tranaction_id")
	private int transactionId;
	
	private String relatedSalecheckNo;
	private int workId;  //1
	private int workItemId;  //11
	private int workflowTypeId;//11
	private int workEventId; //11
	private int workItemActionId; //11
	
	
	private Timestamp transactionTs;//timestamp
	private String transactionType;
	
	
	
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getRelatedSalecheckNo() {
		return relatedSalecheckNo;
	}
	public void setRelatedSalecheckNo(String relatedSalecheckNo) {
		this.relatedSalecheckNo = relatedSalecheckNo;
	}
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public int getWorkItemId() {
		return workItemId;
	}
	public void setWorkItemId(int workItemId) {
		this.workItemId = workItemId;
	}
	public int getWorkflowTypeId() {
		return workflowTypeId;
	}
	public void setWorkflowTypeId(int workflowTypeId) {
		this.workflowTypeId = workflowTypeId;
	}
	public int getWorkEventId() {
		return workEventId;
	}
	public void setWorkEventId(int workEventId) {
		this.workEventId = workEventId;
	}
	public int getWorkItemActionId() {
		return workItemActionId;
	}
	public void setWorkItemActionId(int workItemActionId) {
		this.workItemActionId = workItemActionId;
	}
	public Timestamp getTransactionTs() {
		return transactionTs;
	}
	public void setTransactionTs(Timestamp transactionTs) {
		this.transactionTs = transactionTs;
	}
	
	
	
	
	
}
