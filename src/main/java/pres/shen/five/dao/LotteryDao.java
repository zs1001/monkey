package pres.shen.five.dao;

import pres.shen.five.entity.Lottery;

public interface LotteryDao {
	 Lottery findLotteryByExpect(String expect);
}
