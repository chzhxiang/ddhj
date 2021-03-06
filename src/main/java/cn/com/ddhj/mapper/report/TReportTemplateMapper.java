package cn.com.ddhj.mapper.report;

import java.util.List;

import cn.com.ddhj.dto.BaseDto;
import cn.com.ddhj.mapper.BaseMapper;
import cn.com.ddhj.model.report.TReportTemplate;

/**
 * 
 * 类: TReportTemplateMapper <br>
 * 描述: 报告模板表数据库访问接口 <br>
 * 作者: zhy<br>
 * 时间: 2016年10月2日 下午11:34:14
 */
public interface TReportTemplateMapper extends BaseMapper<TReportTemplate, BaseDto> {

	/**
	 * 
	 * 方法: findReportTemplateByType <br>
	 * 描述: 根据类型访问报告模板内容 <br>
	 * 作者: zhy<br>
	 * 时间: 2016年10月2日 下午11:33:55
	 * 
	 * @param type
	 * @return
	 */
	TReportTemplate findReportTemplateByType(String type);
	
	/**
	 * 
	 * 方法: findReportTemplateAll <br>
	 * 描述: 获取所有报告模板 <br>
	 * 作者: zhy<br>
	 * 时间: 2016年10月3日 上午12:11:36
	 * @return
	 */
	List<TReportTemplate> findReportTemplateAll();
}