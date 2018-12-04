package pres.shen.five.entity;

import java.io.Serializable;
import java.util.Date;

public class Shanghaillxs implements Serializable{
	//开奖期号
	private String expect;
	//开奖码
	private String opencode;
	//开奖时间
	private Date opentime;
	//开奖时间戳 
	private String opentimestamp;
	//开奖时间戳 
	private String openday;
	
	
	
	
	public String getOpenday() {
		return openday;
	}
	public void setOpenday(String openday) {
		this.openday = openday;
	}
	
	public String getExpect() {
		return expect;
	}
	public void setExpect(String expect) {
		this.expect = expect;
	}
	public String getOpencode() {
		return opencode;
	}
	public void setOpencode(String opencode) {
		this.opencode = opencode;
	}
	public String getOpentimestamp() {
		return opentimestamp;
	}
	public void setOpentimestamp(String opentimestamp) {
		this.opentimestamp = opentimestamp;
	}
	public Date getOpentime() {
		return opentime;
	}
	public void setOpentime(Date opentime) {
		this.opentime = opentime;
	}
	
}
