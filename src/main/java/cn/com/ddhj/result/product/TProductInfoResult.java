package cn.com.ddhj.result.product;


public class TProductInfoResult {
	private String productCode;
	private String productName;
	private String mainPicUrl;
	private Integer currentPrice;
	private Integer stockNum;
	private String productTip;
	private Integer flagSellable;
	private String picUrls;

	public String getPicUrls() {
		return picUrls;
	}
	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}
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
	public Integer getFlagSellable() {
		return flagSellable;
	}
	public void setFlagSellable(Integer flagSellable) {
		this.flagSellable = flagSellable;
	}
}
