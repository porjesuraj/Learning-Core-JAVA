package test;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerPlan cp = new CustomerPlan();
		
		PlanTest test = new PlanTest();
		
		test.acceptCustomerPlanDetails(cp);
		
		test.CustomerBill(cp);
		
		
	}

}
