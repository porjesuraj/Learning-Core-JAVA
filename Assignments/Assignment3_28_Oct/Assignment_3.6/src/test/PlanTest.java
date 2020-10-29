package test;

import java.util.Scanner;

public class PlanTest {
	
	
	public void acceptCustomerPlanDetails(CustomerPlan cp)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter customer name");
		cp.setcName(sc.nextLine());
		
		System.out.println("Enter customer plan name ,as 1 for A or 2 for  B or 3 for C");
		 
		cp.setPlan(sc.nextInt());
		
		System.out.println("Enter customer no of calls");
		cp.setNoOfCall(sc.nextInt());
		
		System.out.println("Enter customer no of sms");
		cp.setNoOfSms(sc.nextInt());
		

		
		
	}
	
	
	
	
	public void CustomerBill(CustomerPlan cp)
	{
		double bill = 0;
		
		if(cp.getPlan() == 1)
		{ 
			int freeCalls = 50;
			int  discount = (int) (0.5 * freeCalls);
			int monthlyCharge = 199;
			int netCalls = cp.getNoOfCall() - freeCalls - discount; 
			double callCharge =  netCalls * 1;
			
			double smsCharge = cp.getNoOfSms() * 1;
			
		
		 bill = monthlyCharge + callCharge + smsCharge;	
		 	
			
			
			
			
		}else if(cp.getPlan() == 2)
		{

			int freeCalls = 75;
			int  discount = (int) (0.75 * freeCalls);
			int monthlyCharge = 299;
			int netCalls = cp.getNoOfCall() - freeCalls - discount; 
			double callCharge =  netCalls * 0.80;
			
			double smsCharge = cp.getNoOfSms() * 0.75;
			
		
		 bill = monthlyCharge + callCharge + smsCharge;	
		 	
			
		} else if(cp.getPlan() == 3)
		{
			int freeCalls = 100;
			int  discount = (int) (1 * freeCalls);
			int monthlyCharge = 399;
			int netCalls = cp.getNoOfCall() - freeCalls - discount; 
			double callCharge =  netCalls * 0.60;
			
			double smsCharge = cp.getNoOfSms() * 0.50;
			
		
		 bill = monthlyCharge + callCharge + smsCharge;	
		 	
			
		} else
		{
			System.out.println("wrong choice ,please try again");
		}
		
		double finalBill = (bill * 0.125) + bill;
		
		String plans ;
		
		if(cp.getPlan() == 1)
		{
			plans = "A";
		} else if(cp.getPlan() == 2)
		{
			plans = "B";
		}else if(cp.getPlan() == 3)
		{
			plans = "C";
		}
		else
		{
			plans = "";
		}
		
		
		
		System.out.println("this months bill for customer " + cp.getcName() + " having " + plans +" plan is Rs." + finalBill );
	}

}
