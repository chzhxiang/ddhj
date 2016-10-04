package cn.com.ddhj.mapper;

import cn.com.ddhj.dto.TRubbishRecyclingDto;
import cn.com.ddhj.model.TRubbishRecycling;

/**
 * 
 * 类: TRubbishRecyclingMapper <br>
 * 描述: 垃圾回收站数据库访问接口 <br>
 * 作者: zhy<br>
 * 时间: 2016年10月4日 上午10:53:41
 */
public interface TRubbishRecyclingMapper extends BaseMapper<TRubbishRecycling, TRubbishRecyclingDto> {
	/**
	 * 
	 * 方法: getMaxTChemicalPlant <br>
	 * 描述: 获取小于dto经纬度的垃圾回收站中最大的数据 <br>
	 * 作者: zhy<br>
	 * 时间: 2016年10月4日 上午11:46:55
	 * 
	 * @param dto
	 * @return
	 */
	TRubbishRecycling getMaxTRubbishRecycling(TRubbishRecyclingDto dto);

	/**
	 * 
	 * 方法: getMaxTChemicalPlant <br>
	 * 描述: 获取大于dto经纬度的垃圾回收站中最小的数据 <br>
	 * 作者: zhy<br>
	 * 时间: 2016年10月4日 上午11:46:55
	 * 
	 * @param dto
	 * @return
	 */
	TRubbishRecycling getMinTRubbishRecycling(TRubbishRecyclingDto dto);
}