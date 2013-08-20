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
@Table(name="mcp_work_package")
public class McpWorkPackageEntity {
	@Id
	@GeneratedValue
	private int  packageId;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = McpWorkEntity.class)
	@JoinColumn(name = "work_id")
	private McpWorkEntity work;
	private Integer packageNumber;
    private String layawayBin;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdTs;
    private Timestamp updatedTs;
	/**
	 * @return the packageId
	 */
	public int getPackageId() {
		return this.packageId;
	}
	/**
	 * @param packageId the packageId to set
	 */
	public void setPackageId(int packageId) {
		this.packageId = packageId;
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
	 * @return the packageNumber
	 */
	public Integer getPackageNumber() {
		return this.packageNumber;
	}
	/**
	 * @param packageNumber the packageNumber to set
	 */
	public void setPackageNumber(Integer packageNumber) {
		this.packageNumber = packageNumber;
	}
	/**
	 * @return the layawayBin
	 */
	public String getLayawayBin() {
		return this.layawayBin;
	}
	/**
	 * @param layawayBin the layawayBin to set
	 */
	public void setLayawayBin(String layawayBin) {
		this.layawayBin = layawayBin;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return this.updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the createdTs
	 */
	public Timestamp getCreatedTs() {
		return this.createdTs;
	}
	/**
	 * @param createdTs the createdTs to set
	 */
	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}
	/**
	 * @return the updatedTs
	 */
	public Timestamp getUpdatedTs() {
		return this.updatedTs;
	}
	/**
	 * @param updatedTs the updatedTs to set
	 */
	public void setUpdatedTs(Timestamp updatedTs) {
		this.updatedTs = updatedTs;
	}
}