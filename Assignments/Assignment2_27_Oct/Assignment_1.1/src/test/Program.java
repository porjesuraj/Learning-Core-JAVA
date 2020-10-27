package test;

public class Program {

	public static void main(String[] args) {
		
		int a ;
		
		a = (int) 9348.39 ;
		
     //    long int b ; gives error
         
		short c = (short) 80999;
	
		long d = (long) 2373467e18;
		
		byte e =  (byte) 129;
		
		 float f =  (float) 218.928;
		 
		 double g = 2930.3f;
		 
		 char h = (char) -3;
		 
		// boolean i = 0; error cant cast int to boolean
		 
		System.out.println("int : " + Integer.SIZE  );
		System.out.println("char : " + Character.SIZE  );
		System.out.println("long : " + Long.SIZE  );
		System.out.println("short  : " + Short.SIZE  );
		System.out.println("byte: " + Byte.SIZE  );
		System.out.println("float : " + Float.SIZE  );
		System.out.println("double : " + Double.SIZE  );
		System.out.println("boolean :  not defined" );
		
	}

}


/*2. Write a java program to check type compatibility for following
statements. Observe the effect. Make changes in terms of casting
if needed and also display the width of all the above data types.
• int : 9348.39
• long int : 100
• short : 80999
• long : 2373467e18
• byte : 129
• float : 218.928
• double : 2930.3f
• char : -3
• boolean : 0*/