package cn.com.ddhj.job;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.httpclient.util.DateUtil;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.StringUtils;

import cn.com.ddhj.annotation.Inject;
import cn.com.ddhj.base.BaseClass;
import cn.com.ddhj.service.user.ITUserStepService;

/**
 * 每日凌晨统计根据用户当日步行数赠送碳币
 * 1.5w <= 当日步数 <= 2w步  用户碳币帐户*2,翻倍
 * 2w < 当日步数  用户碳币帐户*3,翻三倍
 * @ClassName: DailyCarbonStepPresent 
 * @Description: TODO
 * @author zht 
 * @date 2017年9月11日 下午7:10:00 
 *
 */
public class DailyCarbonStepPresent extends BaseClass {
	@Inject
	private ITUserStepService stepService;
	private static String current;
	
	public void dailyCountStepPresent() {
		synchronized(this) {
			Calendar c = Calendar.getInstance();
			c.setTime(new Date());
			c.add(Calendar.DAY_OF_MONTH, -1);
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			String yesterday = f.format(c.getTime());
//			String yesterday = DateUtil.formatDate(DateUtils.addDays(new Date(), -1), "yyyy-MM-dd");
			if(StringUtils.isBlank(current) || !current.equals(yesterday)) {
				current = yesterday;
				stepService.dailyCountStepPresent(yesterday);
			}
		}
		
	}
}
