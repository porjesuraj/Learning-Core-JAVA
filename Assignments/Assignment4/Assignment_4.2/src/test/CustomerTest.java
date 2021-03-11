package test;

import java.util.Scanner;

public class CustomerTest {

	
	static boolean[] seatArrangement = new  boolean[10];
	static int economic = 6; 
	static int firstClass = 1; 
	
	public void getFlightReservation(Customer c1) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int ischoice = 0; 
		
		do {

			System.out.println("Please type 1 for First Class \n Please type 2 for Economy.");
			
			
			
			int choice = sc.nextInt(); 
			
			
			
			
			
			switch (choice) {
			    
			    case 1:
			    	if(firstClass < 6 )
					{
						seatArrangement[firstClass] = true;
						
						c1.setSeatNo(firstClass);
						
						System.out.println("Boarding ticket : seat Allocated = " + seatArrangement[firstClass] + ", seat no = " + c1.getSeatNo() );
						
						
						++firstClass;
					} else if(firstClass >= 10 && economic > 6)
					{
						System.out.println("another flight leaves in 3 hours");
					}
			    	
			    	else
					{
						System.out.println("seat is" + 
								"no longer available,");
						System.out.println("Do you want to enter economy class");
						ischoice = 1;
					}
					
				break;
	           case 2:
			    	
			    	if(economic < 11)
					{
			    		seatArrangement[economic] = true;
			    		
			    		c1.setSeatNo(economic); 
			    		System.out.println("Boarding ticket : seat Allocated = " + seatArrangement[economic] + ", seat no = " + c1.getSeatNo() );
			    		++economic;
						
					}else if(firstClass >= 10 && economic >= 6)
					{
						System.out.println("another flight leaves in 3 hours");
					}
			    	else
			    	{
			    		System.out.println("seat is" + 
								"no longer available,");
						System.out.println("Do you want to enter first class");
						ischoice = 1;
			    	}
			    	
				
				break;
				
			default:
				System.out.println("Wrong choice ");
				break;
			}
			
			
			
		} while (ischoice == 1);
		
		
		
		
	
   }
}
