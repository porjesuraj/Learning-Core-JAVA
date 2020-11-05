package snippet;

public class Snippet {
	Employee emp1 = new Employee("Sandeep", 33, 45000);
			Employee emp2 = new Employee("Sandeep", 33, 45000);
			
			if( emp1.equals(emp2) )	//OK : Compares state of references 
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
			//Output : Not Equal
}

