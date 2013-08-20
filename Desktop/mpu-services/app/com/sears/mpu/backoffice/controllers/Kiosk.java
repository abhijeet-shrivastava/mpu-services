package com.sears.mpu.backoffice.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

import com.mysql.jdbc.Constants;
import com.sears.mpu.backoffice.common.MPUConstants;
import com.sears.mpu.backoffice.common.ResponseCodes;
import com.sears.mpu.backoffice.exceptions.FatalMappingException;
import com.sears.mpu.backoffice.models.bo.kiosk.KiosksByStore;
import com.sears.mpu.backoffice.test.models.vo.KioskDetailVO;
import com.sears.mpu.backoffice.test.models.vo.KioskVO;
import com.sears.mpu.backoffice.test.models.vo.MetaVO;
import com.sears.mpu.backoffice.test.stubs.KiosksbyStoreStub;
import com.sears.mpu.backoffice.util.APIUtil;



import play.mvc.Controller;



public class Kiosk extends Controller{

	private static Logger logger = Logger.getLogger(Kiosk.class.getName());
	
	public static void getkioskList(String storeNumber) throws FatalMappingException, IOException{
		logger.info("Entering getkioskList ..............");
		
		KiosksByStore stub = new KiosksByStore();
		stub.setStoreNumber(Integer.parseInt(storeNumber));
		MetaVO meta = null;
		
		try{
			stub.setKioskList(KiosksbyStoreStub.getInstance().getKioskList(storeNumber));
			logger.info("Getting  kiosk List for Store:" + storeNumber);
		    meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		    logger.info(APIUtil.convertEntityToJSON(meta));
		}
		catch(Throwable t){	
			 logger.error("Error getting kiosk list json from db  where  Store Number ="+storeNumber);	
			 logger.info(APIUtil.convertEntityToJSON(meta));
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ ":Error getting kiosk list", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			stub.setMetaVO(meta);
			logger.info("Exiting getkioskList ..............");
			renderJSON(stub);
			
		}
		
	}
	
	public static void getMPUCaptainDetail(int storeNumber,int kioskId){
        renderText("Active user stub for MPU Captain for kiosk " + kioskId+" at store "+ storeNumber);
	}
	
	public static void updateMPUCaptainDetail (int storeNumber,int kioskId,String userId){
		renderText("Updating  stub for MPU Captain for kiosk " + kioskId+" at store "+ storeNumber +"with userID "+userId);
	}
	
	/**
	 *  Search For Orders
	 *  
	 *  Create Pickup
	 *  
	 *  Create Help
	 *  
	 *  Create repair
	 *  
	 *  Initiate Return
	 *  
	 */



}
