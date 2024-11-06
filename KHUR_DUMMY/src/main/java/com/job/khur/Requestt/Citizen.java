package com.job.khur.Requestt;

public class Citizen {

	String fingerprint;
	String certFingerprint;
	String cert;
	String regnum;
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getCertFingerprint() {
		return certFingerprint;
	}
	public void setCertFingerprint(String certFingerprint) {
		this.certFingerprint = certFingerprint;
	}
	public String getCert() {
		return cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}
	public String getRegnum() {
		return regnum;
	}
	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}
	public Citizen(String fingerprint, String certFingerprint, String cert, String regnum) {
		super();
		this.fingerprint = fingerprint;
		this.certFingerprint = certFingerprint;
		this.cert = cert;
		this.regnum = regnum;
	}
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
