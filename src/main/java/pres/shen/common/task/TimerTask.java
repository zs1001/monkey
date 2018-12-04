package pres.shen.common.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import pres.shen.five.controller.util.HttpUtil;
import pres.shen.five.entity.Shanghaillxs;
import pres.shen.five.service.LotteryService;
import pres.shen.five.service.ShangHaillxsServices;

/**
 * 定时器任务类(未使用此类)
 * 
 * @author Administrator
 *
 */
@Component
public class TimerTask {
	
	@Autowired
	private ShangHaillxsServices shxlService;

	@Scheduled(cron="*/5 * * * * ? ")
	public void getLotteryTask1() {
		System.out.println("dingshi出发：：：");
	}
	
	
	
	
//	CRON表达式 含义 
//	“0 0 12 * * ?” 每天中午十二点触发 
//	“0 15 10 ? * *” 每天早上10：15触发 
//	“0 15 10 * * ?” 每天早上10：15触发 
//	“0 15 10 * * ? *” 每天早上10：15触发 
//	“0 15 10 * * ? 2005” 2005年的每天早上10：15触发 
//	“0 * 14 * * ?” 每天从下午2点开始到2点59分每分钟一次触发 
//	“0 0/5 14 * * ?” 每天从下午2点开始到2：55分结束每5分钟一次触发 
//	“0 0/5 14,18 * * ?” 每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发 
//	“0 0-5 14 * * ?” 每天14:00至14:05每分钟一次触发 
//	“0 10,44 14 ? 3 WED” 三月的每周三的14：10和14：44触发 
//	“0 15 10 ? * MON-FRI” 每个周一、周二、周三、周四、周五的10：15触发
	
	
}
