package pres.shen.five.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import pres.shen.five.controller.util.HttpUtil;
import pres.shen.five.entity.Lottery;
import pres.shen.five.entity.Shanghaillxs;
import pres.shen.five.service.LotteryService;
import pres.shen.five.service.ShangHaillxsServices;



@Controller
public class LotteryController {
	
	
	@Autowired
	private LotteryService lotteryService;
	@Autowired
	private ShangHaillxsServices shxlService;
	
	/**
	 * 
	 */
	@RequestMapping(value="/findLotteryByExpect.action",method = RequestMethod.POST)
	public String findLotteryByExpect(String expect,Model model) {
		Lottery lottery = lotteryService.findLotteryByExpect(expect);
		model.addAttribute("lottery",lottery);
		return "Lottery";
		
	}
	
	@RequestMapping("/tx")
	public String findLotteryByExpect1(String expect,Model model) {
		Lottery lottery = lotteryService.findLotteryByExpect(expect);
		model.addAttribute("lottery",lottery);
		return "Lottery";
	}
	
	/**
	 * 九点开始，没十分一期   90期
	 * 
	 */
	
	@Scheduled(cron="0/5 * 9-23 * * ?")
	public void getLotteryTask() {
		String url = "http://f.apiplus.net/sh11x5-1.json";
		String rtnJson = HttpUtil.doPost(url);
		JSONObject json = JSONObject.parseObject(rtnJson);
		String data =json.getString("data");
		System.out.println(data);
		JSONArray parseArray = JSONObject.parseArray(data);
		JSONObject jjj = null;
		for (Object object : parseArray) {
			System.out.println("数组"+object);
			jjj=(JSONObject) object;
		}
		System.out.println(parseArray);
//		JSONArray str ={["expect":"2018112846","opencode":"01,09,02,11,08","opentimestamp":"1543393840","opentime":"2018-11-28 16:30:40"]};
		
		Shanghaillxs shxs = JSON.toJavaObject(jjj,Shanghaillxs.class);
		int v = shxlService.savekc(shxs);
		System.out.println(v);
		System.out.println(rtnJson);
	}
	
	
//	@Scheduled(cron="*/5 * * * * ? ")
//	public void getLotteryTask() {
//		System.out.println("dingshi出发：：：");
//	}
	
	
}
