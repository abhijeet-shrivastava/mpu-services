package com.sears.mpu.backoffice.controllers;

import java.io.IOException;


import org.apache.log4j.Logger;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

import com.sears.mpu.backoffice.common.CacheLevel;
import com.sears.mpu.backoffice.common.MPUConstants;
import com.sears.mpu.backoffice.common.ResponseCodes;
import com.sears.mpu.backoffice.exceptions.FatalMappingException;
import com.sears.mpu.backoffice.helpers.CacheHelper;
import com.sears.mpu.backoffice.models.bo.cache.CachedValue;
import com.sears.mpu.backoffice.models.bo.cache.ExpiryTime;
import com.sears.mpu.backoffice.models.bo.cache.TopLevelPrefix;
import com.sears.mpu.backoffice.models.bo.kiosk.KiosksByStore;
import com.sears.mpu.backoffice.test.models.vo.MetaVO;
import com.sears.mpu.backoffice.util.APIUtil;

import play.mvc.Controller;




public class Cache extends Controller{
	
	private static Logger logger = Logger.getLogger(Cache.class.getName());
	
	public static void getExpirytime() throws FatalMappingException, IOException{
		logger.info("Entering getExpirytime ..............");
		
		ExpiryTime stub = new ExpiryTime();
		MetaVO meta = null;
		
		try{
			stub.setExpiryTime(CacheHelper.getInstance().getExpiryTime(CacheLevel.sql)); 
		    meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		    logger.info(APIUtil.convertEntityToJSON(meta));
		}
		catch(Throwable t){	
			 logger.error("Error getting expiry time for cache");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error getting expiry time for cache", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			stub.setMeta(meta);
			logger.info("Exiting getExpiry time  ..............");
			renderJSON(stub);
			
		}
		
	}
	
	public static void initTopLevelPrefix (String prefix) throws FatalMappingException, IOException{
		logger.info("Entering initTopLevelPrefix ..............");
		TopLevelPrefix stub=new TopLevelPrefix();
		MetaVO meta = null;
		try{			
			logger.info("Initializing Top Level Prefix for cache..............");
			CacheHelper.getInstance().initTopLevelPrefix(CacheLevel.sql, prefix);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Initializing Top Level Prefix for cache....");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Initializing Top Level Prefix for cache....", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			stub.setPrefixName(prefix);
			stub.setMeta(meta);
			logger.info("Exiting Initializing Top Level Prefix for cache...");
			renderJSON(stub);
		}
	}

	public static void addKiosksToStore(String storeNumber) throws FatalMappingException, IOException
	{
		logger.info("Entering addKiosksToStore ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding all kiosks to cache for Store: "+storeNumber+"..............");
			CacheHelper.getInstance().addKioskToStore(storeNumber);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding Kiosks for Store: "+storeNumber+" to Cache.............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding Kiosks for Store: "+storeNumber+" to Cache............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addKiosksToStore..............");
			renderJSON(meta);
		}
		
	}
	
	public static void  getKioskbyStore(String storeNumber,String kioskNumber) throws FatalMappingException, IOException
	{
       
		logger.info("Entering getKioskbyStore ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String kioskJson=null;
        
		try{			
			logger.info("getting kiosk Number"+kioskNumber+"from cache for Store: "+storeNumber+"..............");
			kioskJson=CacheHelper.getInstance().getKioskbyStore(storeNumber, kioskNumber);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error getting Kiosk Number: "+kioskNumber+"from cache for Store: "+storeNumber+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+"Error getting Kiosk Number: "+kioskNumber+"from cache for Store: "+storeNumber+".............."+kioskNumber+"from cache for Store: "+storeNumber, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(kioskJson);
			logger.info(kioskJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getKioskbyStore..............");
			renderJSON(val);
		}
		
	}
	
	public static void addStoreDetails(String storeNumber) throws FatalMappingException, IOException
	{
		logger.info("Entering addStoreDetails ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding Store Details to cache for Store: "+storeNumber+"..............");
			CacheHelper.getInstance().addStoreDetails(storeNumber);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding Store Details for Store: "+storeNumber+" to Cache.............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding Store Details for Store: "+storeNumber+" to Cache.............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addStoreDetails..............");
			renderJSON(meta);
		}
		
	}
	
	public static void  getStoreDetaibyStore(String storeNumber) throws FatalMappingException, IOException
	{
       
		logger.info("Entering getStoreDetaibyStore ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String storeDetailJson=null;
        
		try{			
			logger.info("getting Store Details from cache for Store: "+storeNumber+"..............");
			storeDetailJson=CacheHelper.getInstance().getStoreDetailbyStore(storeNumber);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error getting Store Details from cache for Store: "+storeNumber+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error getting Store Details from cache for Store: "+storeNumber+".............."+storeNumber, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(storeDetailJson);
			logger.info(storeDetailJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getStoreDetaibyStore..............");
			renderJSON(val);
		}
		
	}
	
	public static void addUsers() throws FatalMappingException, IOException
	{
		logger.info("Entering addUsers() ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding Users  to cache ..............");
			CacheHelper.getInstance().addUsers();
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding Users  to cache ..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding Users  to cache ..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addUsers()");
			renderJSON(meta);
		}
		
	}
	
	public static void  getUser(String UserId) throws FatalMappingException, IOException
	{
       
		logger.info("Entering getUser ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String UserJson=null;
        
		try{			
			logger.info("getting  Users from cache for : "+UserId+"..............");
			UserJson=CacheHelper.getInstance().getUser(UserId);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("getting  Users from cache for : "+UserId+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "getting  Users from cache for : "+UserId+"..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(UserJson);
			logger.info(UserJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Entering getUser ..............");
			renderJSON(val);
		}
		
	}
	public static void addActiveUserToStore(String storenNumber,int ActiveUserID) throws FatalMappingException, IOException
	{
		logger.info("Entering addActiveUserToStore ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding Active user with ID  "+ActiveUserID +"to Store "+storenNumber);
			CacheHelper.getInstance().addActiveUserToStore(storenNumber,ActiveUserID);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding Active user with ID  "+ActiveUserID +"to Store "+storenNumber);	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding Active user with ID  "+ActiveUserID +"to Store "+storenNumber, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addActiveUserToStore");
			renderJSON(meta);
		}
		
	}
	
	public static void  getActiveUsersByStore(String storeNumber) throws FatalMappingException, IOException
	{
       
		logger.info("Entering getActiveUsersByStore ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String ActiveUserJson=null;
        
		try{			
			logger.info("getting Active Users from cache for Store: "+storeNumber+"..............");
			ActiveUserJson=CacheHelper.getInstance().getActiveUserbyStore(storeNumber);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error getting Active Users from cache for Store: "+storeNumber+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error getting Active Users from cache for Store: "+storeNumber+"..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(ActiveUserJson);
			logger.info(ActiveUserJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getActiveUsersByStore..............");
			renderJSON(val);
		}
		
	}
	
	public static void addOrderToActiveUser(String storeNumber,int ActiveUserID,int orderID) throws FatalMappingException, IOException
	{
		logger.info("Entering addActiveUserToStore ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding Order"+orderID+" to Active user with ID  "+ActiveUserID +"to Store "+storeNumber);
			CacheHelper.getInstance().addOrderToActiveUser(storeNumber,ActiveUserID,orderID);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding Order"+orderID+" to Active user with ID  "+ActiveUserID +"to Store "+storeNumber);	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding Order"+orderID+" to Active user with ID  "+ActiveUserID +"to Store "+storeNumber, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addActiveUserToStore");
			renderJSON(meta);
		}
		
	}
	
	public static void  getOrderByActiveUser(int ActiveUserId) throws FatalMappingException, IOException
	{
       
		logger.info("Entering getOrderByActiveUser ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String OrderByActiveUserJson=null;
        
		try{			
			logger.info("getting Orders Users from cache for User: "+ActiveUserId+"..............");
			OrderByActiveUserJson=CacheHelper.getInstance().getOrderByActiveUser(ActiveUserId);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error getting Orders Users from cache for User: "+ActiveUserId+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error getting Orders Users from cache for User: "+ActiveUserId+"..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(OrderByActiveUserJson);
			logger.info(OrderByActiveUserJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getOrderByActiveUser..............");
			renderJSON(val);
		}
		
	}
	
	public static void addCustomers() throws FatalMappingException, IOException
	{
		logger.info("Entering addCustomers() ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding Customers  to cache ..............");
			CacheHelper.getInstance().addCustomers();
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding Customers  to cache ..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding Users  to cache ..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addCustomers()");
			renderJSON(meta);
		}
		
	}
	
	public static void addCustomertoStore(String storeNumber,int customerID) throws FatalMappingException, IOException
	{
		logger.info("Entering addCustomertoStore ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding customer with  "+customerID +"to Store "+storeNumber);
			CacheHelper.getInstance().addCustomerToStore(customerID,storeNumber);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding customer with  "+customerID +"to Store "+storeNumber);	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding customer with  "+customerID +"to Store "+storeNumber, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addCustomertoStore");
			renderJSON(meta);
		}
		
	}
	
	public static void getCustomersByStore(String storeNumber,int customerID) throws FatalMappingException, IOException
	{
		logger.info("Entering getCustomersByStore ..............");

		MetaVO meta = null;
		try{			
			logger.info("getting customer with  "+customerID +"from Store "+storeNumber);
			CacheHelper.getInstance().getCustomerByStore(customerID,storeNumber);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error customer with  "+customerID +"from Store "+storeNumber);	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error Adding customer with  "+customerID +"to Store "+storeNumber, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getCustomersByStore");
			renderJSON(meta);
		}
		
	}
	
	
	public static void  getCustomerByStore(int ActiveUserId) throws FatalMappingException, IOException
	{
		logger.info("Entering getOrderByActiveUser ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String CustomerByStoreJson=null;
        
		try{			
			logger.info("getting Orders Users from cache for User: "+ActiveUserId+"..............");
			CustomerByStoreJson=CacheHelper.getInstance().getOrderByActiveUser(ActiveUserId);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error getting Orders Users from cache for User: "+ActiveUserId+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error getting Orders Users from cache for User: "+ActiveUserId+"..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(CustomerByStoreJson);
			logger.info(CustomerByStoreJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getOrderByActiveUser..............");
			renderJSON(val);
		}
		
	}
	
	public static void addOrdertoCustomer(int OrderID,int customerID) throws FatalMappingException, IOException
	{
		logger.info("Entering addOrdertoCustomer ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding Order with  "+OrderID +"to Customer "+customerID);
			CacheHelper.getInstance().addOrdertoCustomer(OrderID,customerID);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error Adding Order with  "+OrderID +"to Customer "+customerID);	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+"Error Adding Order with  "+OrderID +"to Customer "+customerID, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addOrdertoCustomer.....");
			renderJSON(meta);
		}
		
	}
	
	public static void  getOrderByCustomer(int customerId) throws FatalMappingException, IOException
	{
		logger.info("Entering getOrderByCustomer ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String OrderByCustomerJson=null;
        
		try{			
			logger.info("getting Orders Users from cache for User: "+customerId+"..............");
			OrderByCustomerJson=CacheHelper.getInstance().getOrderByCustomer(customerId);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("getting Orders Users from cache for User: "+customerId+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "getting Orders Users from cache for User: "+customerId+"..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(OrderByCustomerJson);
			logger.info(OrderByCustomerJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getOrderByCustomer..............");
			renderJSON(val);
		}
		
	}
	
	public static void addPackageToOrder(String packageID,int OrderID) throws FatalMappingException, IOException{
		
		logger.info("Entering addPackageToOrder ..............");

		MetaVO meta = null;
		try{			
			logger.info("Adding Package with  "+packageID +"to Order "+OrderID);
			CacheHelper.getInstance().addPackageToOrder(OrderID,packageID);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("ErrorAdding Package with  "+packageID +"to Order "+OrderID);	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "ErrorAdding Package with  "+packageID +"to Order "+OrderID, MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting addPackageToOrder.....");
			renderJSON(meta);
		}
		
		
	}
	
	public static void  getPackageForOrder(int OrderID) throws FatalMappingException, IOException
	{
		logger.info("Entering getPackageForOrder ..............");
		CachedValue val=new CachedValue();
		MetaVO meta = null;
        String PackageForOrderJson=null;
        
		try{			
			logger.info("getting Package from cache for Order: "+OrderID+"..............");
			PackageForOrderJson=CacheHelper.getInstance().getPackageForOrder(OrderID);
			meta=new MetaVO(HttpResponseStatus.OK, "SUCCESS", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		catch(Throwable t){
			 logger.error("Error getting Package from cache for Order: "+OrderID+"..............");	
			 meta=new MetaVO(HttpResponseStatus.NOT_FOUND,String.valueOf(ResponseCodes.SC_NOT_FOUND)+ "Error getting Package from cache for Order: "+OrderID+"..............", MPUConstants.SERVER, MPUConstants.ENVIORNMENT);
		}
		finally{
			val.setValue(PackageForOrderJson);
			logger.info(PackageForOrderJson);
			val.setMeta(meta);
			logger.info(APIUtil.convertEntityToJSON(meta));
			logger.info("Exiting getPackageForOrder..............");
			renderJSON(val);
		}
		
	}
	
	
}
