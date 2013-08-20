package com.sears.mpu.backoffice.models.bo.kiosk;

import java.util.List;

import com.sears.mpu.backoffice.test.models.vo.KioskVO;
import com.sears.mpu.backoffice.test.models.vo.MetaVO;


public class KiosksByStore {

 private int storeNumber;
 private List<KioskVO> kioskList;
 private MetaVO meta;
 
 
    public MetaVO getMetaVO() {
	return meta;
    }
	public void setMetaVO(MetaVO meta) {
		this.meta = meta;
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
