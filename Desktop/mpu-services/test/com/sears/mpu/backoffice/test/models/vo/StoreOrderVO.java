package com.sears.mpu.backoffice.test.models.vo;

import java.util.List;

public class StoreOrderVO {
	
private int storeNumber;
private List<OrderVO> orderList;

		public int getStoreNumber() {
			return storeNumber;
		}
		public void setStoreNumber(int storeNumber) {
			this.storeNumber = storeNumber;
		}
		public List<OrderVO> getOrderList() {
			return orderList;
		}
		public void setOrderList(List<OrderVO> orderList) {
			this.orderList = orderList;
		}

}
