package cn.com.ddhj.service.impl.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.ddhj.dto.BaseDto;
import cn.com.ddhj.mapper.report.TReportLevelMapper;
import cn.com.ddhj.model.report.TReportLevel;
import cn.com.ddhj.service.impl.BaseServiceImpl;
import cn.com.ddhj.service.report.ITReportLevelService;

/**
 * 
 * 类: TReportLevelServiceImpl <br>
 * 描述: 环境报告等级业务处理接口实现类 <br>
 * 作者: zhy<br>
 * 时间: 2016年10月4日 下午6:53:16
 */
@Service
public class TReportLevelServiceImpl extends BaseServiceImpl<TReportLevel, TReportLevelMapper, BaseDto>
		implements ITReportLevelService {

	@Autowired
	private TReportLevelMapper mapper;

	@Override
	public List<TReportLevel> findLevelAll() {
		return mapper.findEntityAll();
	}

}
