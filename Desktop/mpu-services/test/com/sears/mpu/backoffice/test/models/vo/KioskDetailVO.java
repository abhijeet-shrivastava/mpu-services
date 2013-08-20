package com.sears.mpu.backoffice.test.models.vo;

public class KioskDetailVO {
	
	private String mpuCaptain;
	private boolean modEnabled;
	private String endpointUrl;
	
	
	public String getEndpointUrl() {
		return endpointUrl;
	}
	public void setEndpointUrl(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}
	public String getMpuCaptain() {
		return mpuCaptain;
	}
	public void setMpuCaptain(String mpuCaptain) {
		this.mpuCaptain = mpuCaptain;
	}
	public boolean isModEnabled() {
		return modEnabled;
	}
	public void setModEnabled(boolean modEnabled) {
		this.modEnabled = modEnabled;
	}
	

}
