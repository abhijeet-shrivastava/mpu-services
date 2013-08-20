package com.sears.mpu.backoffice.models.bo.cache;

import com.sears.mpu.backoffice.test.models.vo.MetaVO;

public class CachedValue {
	
		private String value;
		private  MetaVO meta;

public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
public MetaVO getMeta() {
	return meta;
}
public void setMeta(MetaVO meta) {
	this.meta = meta;
}


}
