package pres.shen.five.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pres.shen.five.dao.LotteryDao;
import pres.shen.five.entity.Lottery;
import pres.shen.five.service.LotteryService;

@Service
@Transactional
public class LotteryServiceImpl implements LotteryService {
	
	@Autowired
	private LotteryDao lotteryDao;

	public Lottery findLotteryByExpect(String expect) {
		System.out.println("--------2");
		Lottery lottery = lotteryDao.findLotteryByExpect(expect);
		return lottery;
	}

}
