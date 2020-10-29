package test;

public class Program {
	
	public static void main(String[] args)
	{
		HealthProfile hp = new HealthProfile();
		
		HealthProfileTest test = new HealthProfileTest();
		
		test.acceptPatientInfo(hp);
		
		hp.toString();
	int age =	test.getPersonAge(hp);
	
	System.out.println("patients age is " + age);
		
	int max =	test.getMaxHeartRate(hp);
		
		System.out.println("patients maximum heart rate is " + max);
		
	double target =	test.getPersonTargetHeartRate(hp);
		System.out.println("patients target heart rate is " +  target);
	}
	
	
	
	
	
}
