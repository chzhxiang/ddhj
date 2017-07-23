package cn.com.ddhj.model;

import java.util.Date;

public class TProductInfo extends BaseModel{
    private String productCode;
    private String productName;
    private String mainPicUrl;
    private Integer currentPrice;
    private Integer stockNum;
    private String productTip;
    
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMainPicUrl() {
		return mainPicUrl;
	}
	public void setMainPicUrl(String mainPicUrl) {
		this.mainPicUrl = mainPicUrl;
	}
	public Integer getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Integer currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Integer getStockNum() {
		return stockNum;
	}
	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}
	public String getProductTip() {
		return productTip;
	}
	public void setProductTip(String productTip) {
		this.productTip = productTip;
	}
}