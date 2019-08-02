package com.itc.trn.mis.model;

import java.util.Date;

public class TransactionInfo {
	
	public TransactionInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public TransactionInfo(String transId, String transStatus, Date transTime) {
		this.transId = transId;
		this.transStatus = transStatus;		
		this.transTime = transTime;
	}
	
	private String transId;
	private String transStatus;		
	private Date transTime;
		
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public Date getTransTime() {
		return transTime;
	}
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}				

}
