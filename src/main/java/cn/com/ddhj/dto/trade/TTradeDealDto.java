package cn.com.ddhj.dto.trade;

import cn.com.ddhj.dto.BaseDto;

public class TTradeDealDto extends BaseDto {
	private String cityId;
	private String objectCode;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getObjectCode() {
		return objectCode;
	}

	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}
}