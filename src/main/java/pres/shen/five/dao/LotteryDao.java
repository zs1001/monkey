package pres.shen.five.dao;

import pres.shen.five.entity.Lottery;

public interface LotteryDao {
	public Lottery findLotteryByExpect(String expect);
}
