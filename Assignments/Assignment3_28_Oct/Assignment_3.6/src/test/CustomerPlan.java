package test;


public class CustomerPlan  {
	
	
	private String cName;
	private int plan ;
	private int noOfCall;
	private int  noOfSms;
	
	
	
	
	
	public CustomerPlan(String cName, int plan, int noOfCall, int noOfSms) {
		
		this.cName = cName;
		this.plan = plan;
		this.noOfCall = noOfCall;
		this.noOfSms = noOfSms;
	}
	public CustomerPlan() {
		
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public int getNoOfCall() {
		return noOfCall;
	}
	public void setNoOfCall(int noOfCall) {
		this.noOfCall = noOfCall;
	}
	public int getNoOfSms() {
		return noOfSms;
	}
	public void setNoOfSms(int noOfSms) {
		this.noOfSms = noOfSms;
	}
	
	
	

}
