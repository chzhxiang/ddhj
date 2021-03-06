package cn.com.ddhj.result.report;

import java.util.List;

import cn.com.ddhj.base.BaseResult;
import cn.com.ddhj.model.report.TReport;

/**
 * 
 * 类: TReportResult <br>
 * 描述: 获取报告列表结果 <br>
 * 作者: zhy<br>
 * 时间: 2016年10月4日 下午5:56:52
 */
public class TReportLResult extends BaseResult {

	/**
	 * 楼盘名称
	 */
	private String name;
	/**
	 * 楼盘描述
	 */
	private String detail;

	private Integer repCount;

	private List<TReport> repList;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRepCount() {
		return repCount;
	}

	public void setRepCount(Integer repCount) {
		this.repCount = repCount;
	}

	public List<TReport> getRepList() {
		return repList;
	}

	public void setRepList(List<TReport> repList) {
		this.repList = repList;
	}

}
