package com.sears.mpu.backoffice.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class KioskId implements Serializable{
	private String storeNo;
	private String kioskName;
	public KioskId(String storeNo, String storeFormat, String kiosk) {
		this.storeNo = storeNo;
		this.kioskName = kiosk;
	}
	public KioskId() {
		}
	public String getStoreNo() {
		return storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}
	public String getKiosk() {
		return kioskName;
	}
	public void setKiosk(String kiosk) {
		this.kioskName = kiosk;
	}
	

}
