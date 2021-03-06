package cn.com.ddhj.service.report;

import java.util.List;

import cn.com.ddhj.dto.BaseDto;
import cn.com.ddhj.model.report.TReportTemplate;
import cn.com.ddhj.service.IBaseService;

/**
 * 
 * 类: ITReportTemplateService <br>
 * 描述: 报告模板表业务逻辑处理接口 <br>
 * 作者: zhy<br>
 * 时间: 2016年10月2日 下午11:37:23
 */
public interface ITReportTemplateService extends IBaseService<TReportTemplate, BaseDto> {

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
	 * 
	 * @return
	 */
	List<TReportTemplate> findReportTemplateAll();
}
