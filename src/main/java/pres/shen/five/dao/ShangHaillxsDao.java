package pres.shen.five.dao;

import pres.shen.five.entity.Shanghaillxs;

public interface ShangHaillxsDao {
	
	/**
	 * 保存开奖结果
	 * @param shxs
	 * @return
	 */
	int savekc(Shanghaillxs shxs);
	
	int isKcByExpect(String expect);
}
