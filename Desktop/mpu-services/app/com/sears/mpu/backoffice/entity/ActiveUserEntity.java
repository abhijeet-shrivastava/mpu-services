package com.sears.mpu.backoffice.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="mcp_active_user")
public class ActiveUserEntity {
	
	@EmbeddedId
	private ActiveUserId activeUserId;
	@Column(name = "user_id", insertable = false, updatable = false)
	private String userId; 
	@Column(name = "logged_in_time", insertable = false, updatable = false)
	private Timestamp loggedInTime;
	private String storeNo ;
	private boolean captainFlag;
	private String activeKiosk;
	private boolean inrange;
	private String socketHost;
	private int webSocketPort;
	private boolean modFlag;
	@Column(name = "logged_out_time", insertable = false, updatable = true)
	private Timestamp loggedOutTime;
	private String userFname;
	private String userLname;
	private String activeUserFlag;
	public String getUserFname() {
		return userFname;
	}
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	public String getUserLname() {
		return userLname;
	}
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	public boolean isModFlag() {
		return modFlag;
	}
	public void setModFlag(boolean modFlag) {
		this.modFlag = modFlag;
	}
	
	
	
	public int getWebSocketPort() {
		return webSocketPort;
	}
	public void setWebSocketPort(int webSocketPort) {
		this.webSocketPort = webSocketPort;
	}
	public Timestamp getLoggedInTime() {
		return loggedInTime;
	}
	public void setLoggedInTime(Timestamp loggedInTime) {
		this.loggedInTime = loggedInTime;
	}
	public Timestamp getLoggedOutTime() {
		return loggedOutTime;
	}
	public void setLoggedOutTime(Timestamp loggedOutTime) {
		this.loggedOutTime = loggedOutTime;
	}
	public ActiveUserId getActiveUserId() {
		return activeUserId;
	}
	public void setActiveUserId(ActiveUserId activeUserId) {
		this.activeUserId = activeUserId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/*public Timestamp getLoggedInTime() {
		return loggedInTime;
	}
	public void setLoggedInTime(Timestamp loggedInTime) {
		this.loggedInTime = loggedInTime;
	}*/
	public String getStoreNo() {
		return storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}
	public boolean isCaptainFlag() {
		return captainFlag;
	}
	public void setCaptainFlag(boolean captainFlag) {
		this.captainFlag = captainFlag;
	}
	public String getActiveKiosk() {
		return activeKiosk;
	}
	public void setActiveKiosk(String activeKiosk) {
		this.activeKiosk = activeKiosk;
	}
	public boolean isInrange() {
		return inrange;
	}
	public void setInrange(boolean inrange) {
		this.inrange = inrange;
	}
	public String getSocketHost() {
		return socketHost;
	}
	public void setSocketHost(String socketHost) {
		this.socketHost = socketHost;
	}
	public String getActiveUserFlag() {
		return activeUserFlag;
	}
	public void setActiveUserFlag(String activeUserFlag) {
		this.activeUserFlag = activeUserFlag;
	}

}
