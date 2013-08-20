package com.sears.mpu.backoffice.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="mcp_store_kiosk")
@IdClass(KioskId.class)
public class KioskDetailEntity {
	@Id
	@AttributeOverrides({
		@AttributeOverride(name="storeNo",column=@Column(name="store_no")),
		@AttributeOverride(name="kioskName",column=@Column(name="kiosk_name")),
		@AttributeOverride(name="modEnabled",column=@Column(name="mod_enabled"))

	})
	private String storeNo;
	private String kioskName;
	private char modEnabled;
	
	public String getKiosk() {
		return kioskName;
	}
	public void setKiosk(String kiosk) {
		this.kioskName = kiosk;
	}
	public void setModEnabled(char modEnabled) {
		this.modEnabled = modEnabled;
	}
	public char getModEnabled() {
		return modEnabled;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}
	public String getStoreNo() {
		return storeNo;
	}
	
}
