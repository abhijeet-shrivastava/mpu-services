package com.sears.mpu.backoffice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="mcp_work_identifier")

public class McpWorkIdentifierEntity {
	
	@Id
	@GeneratedValue
	private int identifierTypeId;
	//Many identifiers to One Order
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "work_id")
	private McpWorkEntity work;
	
	private String identifierData;
	
	private String identifierDescription;
	//TODO need to discuss this table/entity with team
	

	/**
	 * @return the identifierDescription
	 */
	public String getIdentifierDescription() {
		return identifierDescription;
	}
	/**
	 * @param identifierDescription the identifierDescription to set
	 */
	public void setIdentifierDescription(String identifierDescription) {
		this.identifierDescription = identifierDescription;
	}
	/**
	 * @return the identifierData
	 */
	public String getIdentifierData() {
		return identifierData;
	}
	/**
	 * @param identifierData the identifierData to set
	 */
	public void setIdentifierData(String identifierData) {
		this.identifierData = identifierData;
	}
	/**
	 * @return the identifierTypeId
	 */
	public int getIdentifierTypeId() {
		return identifierTypeId;
	}
	/**
	 * @param identifierTypeId the identifierTypeId to set
	 */
	public void setIdentifierTypeId(int identifierTypeId) {
		this.identifierTypeId = identifierTypeId;
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

	

}
