package cn.com.ddhj.service.store;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import cn.com.ddhj.base.BaseResult;
import cn.com.ddhj.dto.store.TProductOrderDto;
import cn.com.ddhj.model.TProductOrder;
import cn.com.ddhj.result.EntityResult;
import cn.com.ddhj.result.ProductOrderResult;
import cn.com.ddhj.service.IBaseService;

public interface ITProductOrderService extends IBaseService<TProductOrder, TProductOrderDto> {

	/**
	 * 
	 * 方法: createOrder <br>
	 * 描述: 创建订单 <br>
	 * 作者: zhy<br>
	 * 时间: 2017年7月24日 上午11:13:13
	 * 
	 * @param dto
	 * @param userToken
	 * @return
	 */
	BaseResult createOrder(TProductOrderDto dto, String userToken);

	/**
	 * 
	 * 方法: findOrderDetailByCode <br>
	 * 描述: 根据订单编码获取订单详情 <br>
	 * 作者: zhy<br>
	 * 时间: 2017年7月24日 上午11:13:29
	 * 
	 * @param orderCode
	 * @return
	 */
	EntityResult findOrderDetailByCode(String orderCode);
	
	/**
	 * @description: 返回指定用户的订单列表信息 
	 * 
	 * @param buyerCode
	 * @return
	 * @author Yangcl 
	 * @date 2017年7月27日 上午11:05:19 
	 * @version 1.0.0.1
	 */
	public JSONObject findProductOrderList(String buyerCode);
}
