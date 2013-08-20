package com.sears.mpu.backoffice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="mcp_work_blob")

public class McpWorkBlobEntity  {
	
	@Id
	@Column(name="work_id", unique=true,nullable=false)
	//@GeneratedValue( strategy=GenerationType.IDENTITY )
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="work"))
	private int workId;
	
	@Column(name="payload", length = 65535, columnDefinition="TEXT")
	private String payload;

	@OneToOne
	@PrimaryKeyJoinColumn
	private McpWorkEntity work;
	
	public String getPayload() {
	        return payload;
	}

	public void setPayload(String payload) {
	 this.payload = payload;
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
	
}
