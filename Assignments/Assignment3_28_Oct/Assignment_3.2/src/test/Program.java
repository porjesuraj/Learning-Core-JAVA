package test;

public class Program {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("suraj", "porje", 1000);
		Employee emp2 = new Employee("raj", "porje", 2000);
		EmployeeTest test = new EmployeeTest();
		
		test.yearlyIncome(emp1);
		test.yearlyIncome(emp2);
		
		test.setRaise(emp1, 10);
		test.setRaise(emp2, 10);
		
		test.yearlyIncome(emp1);
		test.yearlyIncome(emp2);
	}

}
