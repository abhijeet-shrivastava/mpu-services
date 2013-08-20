package com.sears.mpu.backoffice.helpers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.sears.mpu.backoffice.common.CacheLevel;
import com.sears.mpu.backoffice.exceptions.FatalMappingException;
import com.sears.mpu.backoffice.test.models.vo.KioskVO;
import com.sears.mpu.backoffice.test.stubs.KiosksbyStoreStub;
import com.sears.mpu.backoffice.util.APIUtil;


import play.Play;
import play.cache.Cache;

public class CacheHelper {
	private static String cachePrefix = (String)Play.configuration.get("cache.prefix");
	private static String kioskCachePrefix = (String)Play.configuration.get("cache.kiosk.prefix");
	private static String cacheTSExpiry = (String)Play.configuration.getProperty("cache.ts.expiry", "0s");
	private static Map<CacheLevel,String> levelPrefix = new HashMap<CacheLevel,String>();
	private static DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMdd'T'HHmmss");
	private static CacheHelper cacheHelper = new CacheHelper();
	private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CacheHelper.class);
	
	/**
	 * Return the single instance of the CacheManager
	 */
	public static CacheHelper getInstance()
	{
		return cacheHelper;
	}

	/**
	 * Return the expiry time
	 */
	public String getExpiryTime(CacheLevel level)
	{
		String expiry = "30d";

		if (level == CacheLevel.sql)
		{
			expiry = Play.configuration.getProperty("cache.sql.expiry", "30d");
		}
		
		return expiry;
	}
	
	/**
/**
	 * Try to find the cache prefix for this level within the cache, if not found, then generate a new
	 * cache prefix for that level
	 */
	public static String initTopLevelPrefix(CacheLevel level, String ts)
	{
		String levelTSKey = String.format("%s.cachekey.%s", cachePrefix, level);
		String levelTS = Cache.get(levelTSKey, String.class);
		
		if (levelTS == null)
		{
			levelTS = ts;
			
			// update with our TS, only if no one else has already done so
			// TODO need to extend beyond the 30 day limit (Cache class default is 30 days)
			if (!Cache.safeAdd(levelTSKey, levelTS, cacheTSExpiry))
			{
				// someone else updated it, just get it again
				levelTS = Cache.get(levelTSKey, String.class);
			}
			else
			{
				logger.info(String.format("%s created as: %s", levelTSKey, levelTS));
			}
		}

		String prefix = String.format("%s.%s.%s", cachePrefix, level, levelTS);

		levelPrefix.put(level, prefix);
		logger.info(String.format("init cache level: %s prefix: %s", level, prefix));
		
		return prefix;
	}

	/**
	 * Returns the cache prefix for the specified CacheLevel
	 */
	public String getTopLevelPrefix(CacheLevel level)
	{
		return levelPrefix.get(level);
	}

	/**
	 * Resets the cache prefix for a top level cache. All entries under the old cache prefix will eventually expire and all new requests will
	 * use the new cache prefix.
	 */
	public String resetTopLevelPrefix(CacheLevel level, String ts)
	{
		String levelTSKey = String.format("%s.cachekey.%s", cachePrefix, level);
		String levelTS = ts;
		
		// TODO need to extend beyond the 30 day limit (Cache class default is 30 days)
		Cache.set(levelTSKey, levelTS, cacheTSExpiry);
		String newPrefix = initTopLevelPrefix(level, levelTS);
		
		logger.info(String.format("reset cache level: %s prefix: %s", level, newPrefix));
		
		return newPrefix;
	}
	
	/**
	 * 
	 */
	public void addKioskToStore(String StoreNumber)
	{
		String Key = String.format("%s.cachekey.%s.%s", cachePrefix, CacheLevel.sql, StoreNumber);
	
		List<KioskVO> kioskList=KiosksbyStoreStub.getInstance().getKioskList(String.valueOf(StoreNumber));
		
		// TODO need to extend beyond the 30 day limit (Cache class default is 30 days)
		String Value = Cache.get(Key, String.class);
		
		if(Value!= null){
			
		}
		else{
			int j=0;
			Iterator i=kioskList.iterator();
			while(i.hasNext()){
				String kioskKey = String.format("%s.cachekey.kiosk.%s.%s.%s", cachePrefix, CacheLevel.sql, StoreNumber,j);
			try {
				Value=APIUtil.convertEntityToJSON((KioskVO) i.next());
				Cache.safeAdd(kioskKey, Value, cacheTSExpiry);
				logger.info(String.format("%s created as: %s", kioskKey, Value));
			} catch (FatalMappingException e) {
				// TODO Auto-generated catch block
				logger.info("Error Mapping Entity to JSON" );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				logger.info("IO Error whileMapping Entity to JSON" );
			}
			j++;
			}
		}
	}
	
	public String getKioskbyStore(String StoreNumber ,String kioskNumber){		
		String Key = String.format("%s.cachekey.kiosk.%s.%s.%s", cachePrefix, CacheLevel.sql, StoreNumber,kioskNumber);
		String Value = null;	
		Value=Cache.get(Key, String.class);
		return Value;
	}

	public void addStoreDetails(String storeNumber) {
		// TODO Auto-generated method stub
		
		
	}
	
	public String getStoreDetailbyStore(String storeNumber) {
		// TODO Auto-generated method stub
		String Key = String.format("%s.cachekey.storedetails.%s.%s", cachePrefix, CacheLevel.sql, storeNumber);
		String Value = null;	
		Value=Cache.get(Key, String.class);
		return Value;
	}
	
	
	public void addActiveUserToStore(String storeNumber, int activeUserID) {
		// TODO Auto-generated method stub
		
		
	}
	
	public String getActiveUserbyStore(String storeNumber) {
		// TODO Auto-generated method stub
		String Key = String.format("%s.cachekey.activeusers.%s.%s", cachePrefix, CacheLevel.sql, storeNumber);
		String Value = null;	
		Value=Cache.get(Key, String.class);
		return Value;
	}

	
	
	public void addUsers() {
		// TODO Auto-generated method stub
		
	}
	public String getUser(String userId) {
		// TODO Auto-generated method stub
		String Key = String.format("%s.cachekey.users.%s.%s", cachePrefix, CacheLevel.sql, userId);
		String Value = null;	
		Value=Cache.get(Key, String.class);
		return Value;
	}

	
	
	public void addOrderToActiveUser(String storeNumber, int activeUserID,int orderID) {
		// TODO Auto-generated method stub
		
	}
	public String getOrderByActiveUser(int activeUserId) {
		// TODO Auto-generated method stub
		String Key = String.format("%s.cachekey.orders.%s.%s", cachePrefix, CacheLevel.sql, activeUserId);
		String Value = null;	
		Value=Cache.get(Key, String.class);
		return Value;
	}

    
	
	public void addCustomers() {
		// TODO Auto-generated method stub
		
	}

	public void addCustomerToStore(int customerID, String storeNumber) {
		// TODO Auto-generated method stub
		
	}
	public String getCustomerByStore(int customerID, String storeNumber) {
		// TODO Auto-generated method stub
		String Key = String.format("%s.cachekey.customers.%s.%s.%s", cachePrefix, CacheLevel.sql, customerID, storeNumber);
		String Value = null;	
		Value=Cache.get(Key, String.class);
		return Value;
		
	}


	public void addOrdertoCustomer(int orderID, int customerOrderID) {
		// TODO Auto-generated method stub
		
	}
	public String getOrderByCustomer(int customerId) {
		// TODO Auto-generated method stub
		String Key = String.format("%s.cachekey.orders.%s.%s", cachePrefix, CacheLevel.sql, customerId);
		String Value = null;	
		Value=Cache.get(Key, String.class);
		return Value;
	}




	public void addPackageToOrder(int orderID, String packageID) {
		// TODO Auto-generated method stub
		
	}

	public String getPackageForOrder(int orderID) {
		// TODO Auto-generated method stub
		return null;
	}



	/*
	 * Return a timestamp in a modified ISO-8601 format.
	 */
	public static String getTimeStamp()
	{
		return fmt.print(new DateTime());
	}









	

	
	

	
}
