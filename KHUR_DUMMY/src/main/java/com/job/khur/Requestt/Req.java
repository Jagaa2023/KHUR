package com.job.khur.Requestt;

public class Req {
	
	Auth auth;	
	String eyear;
	String regnum;
	String syear;
	
	
	public Auth getAuth() {
		return auth;
	}
	public void setAuth(Auth auth) {
		this.auth = auth;
	}
	public String getEyear() {
		return eyear;
	}
	public void setEyear(String eyear) {
		this.eyear = eyear;
	}
	public String getRegnum() {
		return regnum;
	}
	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public Req(Auth auth, String eyear, String regnum, String syear) {
		super();
		this.auth = auth;
		this.eyear = eyear;
		this.regnum = regnum;
		this.syear = syear;
	}
	public Req() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
