package pres.shen.five.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pres.shen.five.dao.ShangHaillxsDao;
import pres.shen.five.entity.Shanghaillxs;
import pres.shen.five.service.ShangHaillxsServices;

@Service
@Transactional
public class ShangHaillxsServicesImpl implements ShangHaillxsServices {
	
	@Autowired
	private ShangHaillxsDao shxsdao;
	
	@Override
	public int savekc(Shanghaillxs shxs) {
		int v1 = shxsdao.isKcByExpect(shxs.getExpect());
		System.out.println("v"+v1);
		if(v1>0) {
			return v1;
		}
		
		shxs.setOpenday(shxs.getOpencode().substring(0, 7));
		int v = shxsdao.savekc(shxs);
		return v;
	}

}
