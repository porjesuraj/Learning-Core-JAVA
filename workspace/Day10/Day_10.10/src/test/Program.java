package test;
//top level class

public class Program { // Program.class

	public static void main(String[] args) {
	
//Object obj;	//obj => reference
//new Object();	//new Object(); => Anonymous Instance
//Object obj = new Object( );	//Instance with reference
		// Program$1.class
		Object obj = new Object() {
			
			private String message = "Inside anonymous class";
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return this.message;
			}
			
		}; //anonymous class
		
		String msg = obj.toString();
		System.out.println(msg);
	}

}
