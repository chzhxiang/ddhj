package cn.com.ddhj.controller.store;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.ddhj.base.BaseResult;
import cn.com.ddhj.dto.store.TProductInfoDto;
import cn.com.ddhj.helper.WebHelper;
import cn.com.ddhj.model.TProductInfo;
import cn.com.ddhj.model.system.SysUser;
import cn.com.ddhj.result.PageResult;
import cn.com.ddhj.service.store.ITProductInfoService;

@Controller
@RequestMapping("store/product/")
public class TProductInfoController {

	@Autowired
	private ITProductInfoService service;

	@RequestMapping("index")
	public String index() {
		return "/jsp/store/product/index";
	}

	@RequestMapping("data")
	@ResponseBody
	public PageResult data(TProductInfoDto dto) {
		return service.findDataPage(dto);
	}

	@RequestMapping("detail")
	public String detail(String productCode,ModelMap model) {
		TProductInfo product=service.selectByCode(productCode);
		model.addAttribute("product", product);
		return "/jsp/store/product/detail";
	}

	@RequestMapping("addindex")
	public String addIndex() {
		return "/jsp/store/product/add";
	}

	@RequestMapping("add")
	@ResponseBody
	public BaseResult add(TProductInfo entity, HttpSession session) {
		BaseResult result = new BaseResult();
		SysUser user = (SysUser) session.getAttribute("user");
		if (user != null) {
			entity.setProductCode(WebHelper.getInstance().getUniqueCode("TP"));
			entity.setCreateUser(user.getCode());
			result = service.insertSelective(entity);
		} else {
			result.setResultCode(-1);
			result.setResultMessage("用户尚未登录");
		}
		return result;
	}

	@RequestMapping("editindex")
	public String editIndex(String productCode, ModelMap model) {
		TProductInfo product = service.selectByCode(productCode);
		model.addAttribute("product", product);
		return "/jsp/store/product/edit";
	}

	@RequestMapping("edit")
	@ResponseBody
	public BaseResult edit(TProductInfo entity, HttpSession session) {
		BaseResult result = new BaseResult();
		SysUser user = (SysUser) session.getAttribute("user");
		if (user != null) {
			entity.setUpdateUser(user.getCode());
			result = service.updateByCode(entity);
		} else {
			result.setResultCode(-1);
			result.setResultMessage("用户尚未登录");
		}
		return result;
	}

	@RequestMapping("del")
	@ResponseBody
	public BaseResult del(String productCode, HttpSession session) {
		BaseResult result = new BaseResult();
		SysUser user = (SysUser) session.getAttribute("user");
		if (user != null) {
			result = service.deleteByCode(productCode);
		} else {
			result.setResultCode(-1);
			result.setResultMessage("用户尚未登录");
		}
		return result;
	}
}