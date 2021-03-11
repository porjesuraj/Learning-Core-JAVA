package test;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		HeartRates hr = new HeartRates();
 
		hr.setFirstName(JOptionPane.showInputDialog("Enter first name"));
		
		hr.setLastName(JOptionPane.showInputDialog("Enter last name"));
		
		hr.setYear(Integer.parseInt( JOptionPane.showInputDialog("Enter birth year in yyyy format ,e.g 1900"))  );
		
		
		hr.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Enter birth month ")));
	 
		hr.setDay(Integer.parseInt(JOptionPane.showInputDialog("Enter birth day ")));
		
		
		//persons age 
		
	int age =	hr.getPersonAge(hr);
	
	System.out.println("person age = " + age);
		
	// max heart rate 
	
	int maxRate = hr.getMaxHeartRate(hr);
	System.out.println("person max heart rate = " + maxRate);
	
	// person target heart rate 
	
	double target = hr.getPersonTargetHeartRate(hr);
	System.out.println("person target heart rate = " + target);
	}

}
