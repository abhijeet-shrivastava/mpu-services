package com.sears.mpu.backoffice.util;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.module.SimpleModule;
import org.json.JSONException;
import org.json.JSONObject;

import com.sears.mpu.backoffice.exceptions.FatalMappingException;
import com.sears.mpu.backoffice.exceptions.InvalidJSONStringException;



public class APIUtil {
	 public static Logger logger = Logger.getLogger(APIUtil.class);
	 private static ObjectMapper defaultObjectMapper = new ObjectMapper();

	    /**
	* Map a JSON string to an entity.
	*
	* @param JSONString The JSON string to map.
	* @param entity The entity the JSON will be mapped to.
	* @param <T> The type of the entity.
	* @return An instance of the specified entity hydrated with values from the JSON.
	* @throws InvalidJSONStringException The JSON string provided was not valid.
	* @throws FatalMappingException A fatal mapping exception occurred.
	     * @throws IOException 
	*/
	    public static <T> T mapJSONStringToEntity(String JSONString, Class<T> entity) 
	    		throws InvalidJSONStringException, FatalMappingException, IOException
	    {
	        logger.debug("JSON Input:\n " + JSONString);
	        T mappedEntity = null;
	        if(JSONString != null){
	        try
	        {
	            mappedEntity = defaultObjectMapper.<T>readValue(JSONString,entity);
	        }
	        catch (JsonMappingException e)
	        {
	            logger.debug("\n\n\nJackson threw a JsonMapping Exception.\n\n\n");
	            throw new FatalMappingException("Error Mapping the Json string to MonogProduct ",e);
	        }
	        catch (JsonParseException e)
	        {
	            logger.debug("\n\n\nJackson threw a JsonParse Exception. This is probably due to malformed JSON.\n\n\n");
	            throw new InvalidJSONStringException("Error Pasing Json String ",e);
	        }
	        }
	        return mappedEntity;
	    }

	    public static <T> T mapJSONNodeStringToEntity(String JSONString, String rootNode, Class<T> entity) 
	    		throws InvalidJSONStringException, FatalMappingException, JSONException, IOException
	    {
	        logger.debug("JSON Input:\n " + JSONString);
	        T mappedEntity = null;
	        try
	        {
	                JSONObject object = new JSONObject(JSONString);
	                String node = object.getString(rootNode);
	                mappedEntity =  defaultObjectMapper.<T>readValue(node,entity); 
	        }
	        catch (JsonMappingException e)
	        {
	            logger.debug("\n\n\nJackson threw a JsonMapping Exception.\n\n\n");
	            throw new FatalMappingException("Error Mapping the Json string to MonogProduct ",e);
	        }
	        catch (JsonParseException e)
	        {
	            logger.debug("\n\n\nJackson threw a JsonParse Exception. This is probably due to malformed JSON.\n\n\n");
	            throw new InvalidJSONStringException("Error Pasing Json String ",e);
	        }
	     
	        return mappedEntity;
	    }

	    /**
	* Convert an entity instance to a JSON string.
	*
	* @param entity The entity to convert to JSON
	* @return JSON String representation of the entity.
	* @throws FatalMappingException There was a fatal mapping exception.
	     * @throws IOException 
	*/
	    public static String convertEntityToJSON(Object entity) throws FatalMappingException, IOException
	    {
	        String outputString;
	        try
	        {
	            outputString = defaultObjectMapper.writeValueAsString(entity);
	        }
	        catch (JsonMappingException e)
	        {
	            logger.debug("\n\n\nJackson threw a JsonMapping Exception.\n\n\n");
	            throw new FatalMappingException(e);
	        }
	        catch (JsonGenerationException e)
	        {
	            logger.debug("\n\n\nJackson threw a JsonGeneration Exception. Ensure your entities break down into simple types.\n\n\n");
	            throw new FatalMappingException(e);
	        }
	        
	        logger.debug("JSON Output:\n " + outputString);
	        return outputString;
	    }

	    @SuppressWarnings("unchecked")
		public static <T> void registerDeserializerModule(String deserializerName, JsonDeserializer jsonDeserializer, Class<T> entityClass)
	    {
	        SimpleModule module = new SimpleModule(
	                deserializerName,
	                new Version(1, 0, 0, null)
	        );
	        module.addDeserializer(entityClass, jsonDeserializer);
	       defaultObjectMapper.registerModule(module);
	    }
	    
	  public static String getMD5(String input) {
		  
	        try {
	        	
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            byte[] messageDigest = md.digest(input.getBytes());
	            BigInteger number = new BigInteger(1, messageDigest);
	            String hashtext = number.toString(16);
	            // Now we need to zero pad it if you actually want the full 32 chars.
	            while (hashtext.length() < 32) {
	                hashtext = "0" + hashtext;
	            }
	            return hashtext;
	        }
	        catch (NoSuchAlgorithmException e) {
	            throw new RuntimeException(e);
	        }
	    }
	  
	  public static boolean isValidSearsPartnumber(String partnumber){
	        boolean isValid = false;
	        if(!StringUtils.isEmpty(partnumber)){
		        if(StringUtils.endsWith(partnumber, "P")){
		              if(StringUtils.length(partnumber)==12){
		                    if(StringUtils.isNumeric(StringUtils.chop(partnumber))){
		                          isValid=true;
		                    }
		              }
		        }
	        }
	        return isValid;
	  }
}
