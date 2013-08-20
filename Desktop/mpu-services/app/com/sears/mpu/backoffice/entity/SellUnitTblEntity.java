package com.sears.mpu.backoffice.entity;
/**
 * @author rkumar9 store local time entiry.
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sell_unit_tbl")
public class SellUnitTblEntity {

	@Id
	@Column(name="SHC_UNIT_ID")
	private String SHCUNITID;
	@Column(name="ORIG_UNIT_ID")
	private String ORGUNITID;
	/*@Column(name="SHC_UNIT_OPN_DT")
	private Date SHCUNITOPNDT;*/
	@Column(name="SHC_UNIT_NAME")
	private String SHCUNITNAME;
	@Column(name="SHC_UNIT_REGION")
	private String SHCUNITREGION;
	@Column(name="SHC_UNIT_DISTRICT")
	private String SHCUNITDISTRICT; 
	@Column(name="ADDR_LN")
	private String ADDRLN;
	@Column(name="CTY_NM")
	private String CTYNM;
	@Column(name="COUNTY_NM")
	private String COUNTYNM;
	@Column(name="STATE_CD")
	private String STATECD;
	@Column(name="PSTL_CD")
	private String PSTLCD;
	@Column(name="PHONE_NBR")
	private String PHONENBR;
	@Column(name="TIME_ZONE")
	private String TIMEZONE;
	@Column(name="shc_unit_typ")
	private String shcunittyp;
	@Column(name="SHC_UNIT_SUB_TYP")
	private String SHCUNITSUBTYP;
	/**
	 * @return the sHCUNITID
	 */
	public String getSHCUNITID() {
		return SHCUNITID;
	}
	/**
	 * @param sHCUNITID the sHCUNITID to set
	 */
	public void setSHCUNITID(String sHCUNITID) {
		SHCUNITID = sHCUNITID;
	}
	/**
	 * @return the oRGUNITID
	 */
	public String getORGUNITID() {
		return ORGUNITID;
	}
	/**
	 * @param oRGUNITID the oRGUNITID to set
	 */
	public void setORGUNITID(String oRGUNITID) {
		ORGUNITID = oRGUNITID;
	}
	/**
	 * @return the sHCUNITOPNDT
	 *//*
	public Date getSHCUNITOPNDT() {
		return SHCUNITOPNDT;
	}
	*//**
	 * @param sHCUNITOPNDT the sHCUNITOPNDT to set
	 *//*
	public void setSHCUNITOPNDT(Date sHCUNITOPNDT) {
		SHCUNITOPNDT = sHCUNITOPNDT;
	}*/
	/**
	 * @return the sHCUNITNAME
	 */
	public String getSHCUNITNAME() {
		return SHCUNITNAME;
	}
	/**
	 * @param sHCUNITNAME the sHCUNITNAME to set
	 */
	public void setSHCUNITNAME(String sHCUNITNAME) {
		SHCUNITNAME = sHCUNITNAME;
	}
	/**
	 * @return the sHCUNITREGION
	 */
	public String getSHCUNITREGION() {
		return SHCUNITREGION;
	}
	/**
	 * @param sHCUNITREGION the sHCUNITREGION to set
	 */
	public void setSHCUNITREGION(String sHCUNITREGION) {
		SHCUNITREGION = sHCUNITREGION;
	}
	/**
	 * @return the sHCUNITDISTRICT
	 */
	public String getSHCUNITDISTRICT() {
		return SHCUNITDISTRICT;
	}
	/**
	 * @param sHCUNITDISTRICT the sHCUNITDISTRICT to set
	 */
	public void setSHCUNITDISTRICT(String sHCUNITDISTRICT) {
		SHCUNITDISTRICT = sHCUNITDISTRICT;
	}
	/**
	 * @return the aDDRLN
	 */
	public String getADDRLN() {
		return ADDRLN;
	}
	/**
	 * @param aDDRLN the aDDRLN to set
	 */
	public void setADDRLN(String aDDRLN) {
		ADDRLN = aDDRLN;
	}
	/**
	 * @return the cTYNM
	 */
	public String getCTYNM() {
		return CTYNM;
	}
	/**
	 * @param cTYNM the cTYNM to set
	 */
	public void setCTYNM(String cTYNM) {
		CTYNM = cTYNM;
	}
	/**
	 * @return the cOUNTYNM
	 */
	public String getCOUNTYNM() {
		return COUNTYNM;
	}
	/**
	 * @param cOUNTYNM the cOUNTYNM to set
	 */
	public void setCOUNTYNM(String cOUNTYNM) {
		COUNTYNM = cOUNTYNM;
	}
	/**
	 * @return the sTATECD
	 */
	public String getSTATECD() {
		return STATECD;
	}
	/**
	 * @param sTATECD the sTATECD to set
	 */
	public void setSTATECD(String sTATECD) {
		STATECD = sTATECD;
	}
	/**
	 * @return the pSTLCD
	 */
	public String getPSTLCD() {
		return PSTLCD;
	}
	/**
	 * @param pSTLCD the pSTLCD to set
	 */
	public void setPSTLCD(String pSTLCD) {
		PSTLCD = pSTLCD;
	}
	/**
	 * @return the pHONENBR
	 */
	public String getPHONENBR() {
		return PHONENBR;
	}
	/**
	 * @param pHONENBR the pHONENBR to set
	 */
	public void setPHONENBR(String pHONENBR) {
		PHONENBR = pHONENBR;
	}
	/**
	 * @return the tIMEZONE
	 */
	public String getTIMEZONE() {
		return TIMEZONE;
	}
	/**
	 * @param tIMEZONE the tIMEZONE to set
	 */
	public void setTIMEZONE(String tIMEZONE) {
		TIMEZONE = tIMEZONE;
	}
	/**
	 * @return the shcunittyp
	 */
	public String getShcunittyp() {
		return shcunittyp;
	}
	/**
	 * @param shcunittyp the shcunittyp to set
	 */
	public void setShcunittyp(String shcunittyp) {
		this.shcunittyp = shcunittyp;
	}
	/**
	 * @return the sHCUNITSUBTYP
	 */
	public String getSHCUNITSUBTYP() {
		return SHCUNITSUBTYP;
	}
	/**
	 * @param sHCUNITSUBTYP the sHCUNITSUBTYP to set
	 */
	public void setSHCUNITSUBTYP(String sHCUNITSUBTYP) {
		SHCUNITSUBTYP = sHCUNITSUBTYP;
	}
	
	
}
