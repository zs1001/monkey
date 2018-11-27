package pres.shen.five.entity;

import java.io.Serializable;
import java.util.Date;

public class Lottery implements Serializable{
	//寮�濂栨湡鍙�
	private String expect;
	//寮�濂栧彿鐮�
	private String opencode;
	//鏃堕棿鎴�
	private String opentimestamp;
	//寮�濂栨椂闂�
	private Date opentime;
	
	
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
