package pres.shen.five.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import pres.shen.five.entity.Lottery;
import pres.shen.five.service.LotteryService;



@Controller
@RequestMapping("/admin")
public class LotteryController {
	
	
	@Autowired
	private LotteryService lotteryService;
	
	/**
	 * 
	 */
	@RequestMapping(value="/findLotteryByExpect.action",method = RequestMethod.POST)
	public String findLotteryByExpect(Model model) {
		String expect="1";
		System.out.println("-----------銆�1"+expect);
		System.out.println("-----------銆�1"+expect);
		Lottery lottery = lotteryService.findLotteryByExpect(expect);
		model.addAttribute("lotery",lottery);
		return "Lottery";
		
	}
	
	@RequestMapping("/tx")
	public String findLotteryByExpect1(String expect,Model model) {
		System.out.println("-----------銆�1"+expect);
		Lottery lottery = lotteryService.findLotteryByExpect(expect);
		model.addAttribute("lotery",lottery);
		return "Lottery";
		
	}
	
}
