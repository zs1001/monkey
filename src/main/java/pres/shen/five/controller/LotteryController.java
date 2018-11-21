package pres.shen.five.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pres.shen.five.entity.Lottery;
import pres.shen.five.service.LotteryService;



@Controller("lottery")
public class LotteryController {
	
	
	@Autowired
	private LotteryService lotteryService;
	
	/**
	 * 
	 */
	@RequestMapping(value="/findLotteryByExpect",method = RequestMethod.POST)
	public String findLotteryByExpect(String expect,Model model) {
		System.out.println("-----------。1"+expect);
		Lottery lottery = lotteryService.findLotteryByExpect(expect);
		model.addAttribute("lttery",lottery);
		return "Lottery";
		
	}
}
