package com.sears.mpu.backoffice.test.models.vo;

import org.jboss.netty.handler.codec.http.HttpResponseStatus;

public class MetaVO {
      private HttpResponseStatus status;
      private String message;
      private String server;
      private String enviornment;
       
    
	public MetaVO(HttpResponseStatus status, String message, String server,
			String enviornment) {
		super();
		this.status = status;
		this.message = message;
		this.server = server;
		this.enviornment = enviornment;
	}
	
	public HttpResponseStatus getStatus() {
		return status;
	}
	public void setStatus(HttpResponseStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getEnviornment() {
		return enviornment;
	}
	public void setEnviornment(String enviornment) {
		this.enviornment = enviornment;
	}
      
}
