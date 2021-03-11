package test;
/* 
Q.1 Write a program using arrays to display the output in the
following form:
4 3 2 1
3 2 1
2 1
1
 */
public class Program {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {4,3,2,1};
		int a= 4 ;
	    while(a != 0)
	    {
	    	for (int i = a ; i >= 1; i--) {
				
				
				
					System.out.print(i + " ");
				
				
			}
	    	
	    	System.out.println();
	    	
	    	a--;
	    }
		
		
		
		
	}

}
