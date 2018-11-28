package pres.shen.five.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pres.shen.five.entity.Lottery;
import pres.shen.five.service.LotteryService;



@Controller
public class LotteryController {
	
	
	@Autowired
	private LotteryService lotteryService;
	
	/**
	 * 
	 */
	@RequestMapping(value="/findLotteryByExpect.action",method = RequestMethod.POST)
	public String findLotteryByExpect(String expect,Model model) {
		System.out.println("-----------銆�1"+expect);
		Lottery lottery = lotteryService.findLotteryByExpect(expect);
		model.addAttribute("lottery",lottery);
		return "Lottery";
		
	}
	
	@RequestMapping("/tx")
	public String findLotteryByExpect1(String expect,Model model) {
		System.out.println("-----------銆�1"+expect);
		Lottery lottery = lotteryService.findLotteryByExpect(expect);
		model.addAttribute("lottery",lottery);
		return "Lottery";
	}
	
//	@Scheduled(cron="*/5 * * * * ? ")
//	public void getLotteryTask() {
//		System.out.println("dingshi出发：：：");
//	}
	
	
}
