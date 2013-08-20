package com.sears.mpu.backoffice.test.stubs;

import java.util.ArrayList;
import java.util.List;

import com.sears.mpu.backoffice.models.bo.kiosk.KiosksByStore;
import com.sears.mpu.backoffice.test.models.vo.KioskDetailVO;
import com.sears.mpu.backoffice.test.models.vo.KioskVO;




public class KiosksbyStoreStub {

	private static KiosksbyStoreStub kiosksbyStoreStub;
	

	public static KiosksbyStoreStub getInstance(){
		kiosksbyStoreStub=new KiosksbyStoreStub();
		return kiosksbyStoreStub;
	}
	
	public static List<KioskVO>  getKioskList(String storeNumber){
		List<KioskVO> kioskList=new ArrayList();
		KioskVO kiosk1=new KioskVO();
		kiosk1.setKioskID(1);
		kiosk1.setKioskName("mpu-"+storeNumber+"-1");
		KioskDetailVO kioskDetail1=new KioskDetailVO();
		kioskDetail1.setModEnabled(false);
		kioskDetail1.setMpuCaptain("jdoe");
		kioskDetail1.setEndpointUrl("http://www.youtube.com/watch?v=qXVh3y_FH4A");
		kiosk1.setKioskDetail(kioskDetail1);
		
		KioskVO kiosk2=new KioskVO();
		kiosk2.setKioskID(2);
		kiosk2.setKioskName("mpu-"+storeNumber+"-1");
		KioskDetailVO kioskDetail2=new KioskDetailVO();
		kioskDetail2.setModEnabled(false);
		kioskDetail2.setMpuCaptain("jdoe2");
		kiosk2.setKioskDetail(kioskDetail2);
		kioskDetail2.setEndpointUrl("http://www.youtube.com/watch?v=qXh3y_FH4A");
		
		kioskList.add(kiosk1);
		kioskList.add(kiosk2);
		return kioskList;
	}
}
