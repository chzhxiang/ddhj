package cn.com.ddhj.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.com.ddhj.result.estateInfo.EData;
import cn.com.ddhj.service.IEstateInfoService;
import cn.com.ddhj.util.CommonUtil;

public class Task1032Estate implements Callable<List<EnvInfo>> {
	
	private IEstateInfoService estateService;  // 地产信息相关接口 
	
	private String position;
	
	private String radius;
	
	public List<EnvInfo> call() throws Exception {
		List<EnvInfo> list = new ArrayList<EnvInfo>();
		
		String[] arr = this.getPosition().split(",");
		String lat = arr[0];
		String lng = arr[1]; 
		JSONObject obj = estateService.estateInfoList(lng, lat, "1" , "10" , this.getRadius()); 
		EnvInfo rj = new EnvInfo();
		rj.setName("容积率");
		EnvInfo lh = new EnvInfo();
		lh.setName("绿化率");
		if(obj.getString("code").equals("1")){
			TreeMap<Integer , EData> map = new TreeMap<Integer , EData>();
			List<EData> list_ = JSONArray.parseArray(obj.getString("list") , EData.class);
			for(EData e : list_){
				Integer distance = CommonUtil.getDistance(Double.valueOf(lat) , Double.valueOf(lng) , Double.valueOf(e.getLat()) , Double.valueOf(e.getLng()));
				map.put(distance , e);
			}
			EData e = map.get(map.firstKey());
			
			if(e.getVolumeRate() != null){
				Double v = null;
				String vol = e.getVolumeRate();
				if(vol.length() > 2){
					vol = vol.substring(0, 2);
					try {
						v = Double.valueOf(vol);
					}catch (Exception e2) {
						vol = "1.2";
						v = 1.2;
					}
				}else{
					vol = "1.2";
					v = 1.2;
				}
				
				rj.setMemo(vol);
				if(v < 1){
					rj.setLevel("低");
				}else if( 1< v && v < 2){ 
					rj.setLevel("适中");
				}else{
					rj.setLevel("高");
				}
			}else{
				rj.setMemo("1.2");
				rj.setLevel("适中");
			}
			
			if(e.getGreeningRate() != null){
				String g = e.getGreeningRate().split("（")[0];
				if(g.length() < 2){
					lh.setMemo("25%");
				}else{
					lh.setMemo(g);
				}
				String l = e.getGreeningRate().split("绿化率")[1];
				l = l.substring(0, l.length() -1);
				lh.setLevel(l); 
			}else{
				lh.setMemo("28%");
				lh.setLevel("高");
			}
		}else{
			rj.setMemo("1.2");
			rj.setLevel("适中");     
			lh.setMemo("28%");
			lh.setLevel("高");;
		}
		list.add(rj);
		list.add(lh);
		return list; 
	}

	
	
	public IEstateInfoService getEstateService() {
		return estateService;
	}
	public void setEstateService(IEstateInfoService estateService) {
		this.estateService = estateService;
	}

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getRadius() {
		return radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}
	
}




























