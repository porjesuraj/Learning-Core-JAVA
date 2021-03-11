package test;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		//public String(StringBuilder builder)
		StringBuilder sb = new StringBuilder("SunBeam");
		String str = new String(sb);
	}
	public static void main7(String[] args) {
		//public String(StringBuffer buffer)
		StringBuffer sb = new StringBuffer("SunBeam");
		String str = new String(sb);
	}
	
	public static void main6(String[] args) {
		//public String(String original)
		String str1 = new String("SunBeam");
		String str2 = new String( str1 );
	}
	public static void main5(String[] args) {
		//public String(char[] value)
		char[] data = new char[ ] {'D','A','C'};
		String str = new String( data );
		System.out.println(str);
	}
	
	public static void main4(String[] args) {
	
	
	byte[] bs = new byte[] {65,66,67};
	String str = new String(bs); 
	
	//byte : 1 byte : -128 to 127
	System.out.println(str);
	// [65, 66, 67]

			
		}
	
	
	public static void main3(String[] args) {
		//public String()
	String s1 = "ABC";
	
	byte[] bs = s1.getBytes();
	
	//byte : 1 byte : -128 to 127
	System.out.println(Arrays.toString(bs));
	// [65, 66, 67]

			
		}
	
	
	public static void main2(String[] args) {
		//public String()
				String s1 = new String( );
				//String s1;	//Object reference: Java Stack
				//new String( );	//String instance : Heap
				System.out.println(s1.isEmpty()+"	"+s1.length());
		
			
		}
	
	
	public static void main1(String[] args) {

	String str = "Pune";
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(1));
	System.out.println(str.charAt(2));
	System.out.println(str.charAt(3));
	//System.out.println(str.charAt(4));//.StringIndexOutOfBoundsException
		
	}
	

}
