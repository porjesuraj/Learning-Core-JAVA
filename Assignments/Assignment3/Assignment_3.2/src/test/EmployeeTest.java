package test;

public class EmployeeTest {
	
	
	public void yearlyIncome(Employee emp)
	{
		double yearlySal = emp.getMonthlySalary() * 12;
		
		System.out.println("yearly salary on employee " + emp.getFirstName() + " " + emp.getLastName() + " is " + yearlySal);
	}
	
	public void setRaise(Employee emp, double raise)
	{
		double newSalary = emp.getMonthlySalary() + (emp.getMonthlySalary() * raise)/100; 
		
		
		System.out.println(newSalary);
		emp.setMonthlySalary(newSalary);
	}

}


/*
Write a test application
named
EmployeeTest
that
demonstrates
class
Employee’s
capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10% raise and
display each Employee’s yearly salary again.*/