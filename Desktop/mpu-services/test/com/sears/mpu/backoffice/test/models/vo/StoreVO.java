package com.sears.mpu.backoffice.test.models.vo;

import java.util.List;

public class StoreVO {
	
   private int storeNumber;
   private String storeType;
   
   private List<KioskVO> kioskList;
   
   
		public String getStoreType() {
	return storeType;
}
public void setStoreType(String storeType) {
	this.storeType = storeType;
}
		public int getStoreNumber() {
			return storeNumber;
		}
		public void setStoreNumber(int storeNumber) {
			this.storeNumber = storeNumber;
		}
		public List<KioskVO> getKioskList() {
			return kioskList;
		}
		public void setKioskList(List<KioskVO> kioskList) {
			this.kioskList = kioskList;
		}
		   
   
}
