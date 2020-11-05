package test;

import java.util.Arrays;

public class Program {
	
	public static void main(String[] args) {
		String s1 = "SunBeam";
		String s2 = "SunBeam";
		if( s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
	public static void main5(String[] args) {
		String s1 = "SunBeam";
		String s2 = "SunBeam";
		if( s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main4(String[] args) {
		String s1 = new String("DAC");
		String s2 = new String("DAC");
		if( s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : not Equal
	}
	
	public static void main3(String[] args) {
		String s1 = new String("DAC");
		String s2 = new String("DAC");
		if( s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main2(String[] args) {
		//String s2 = "SunBeam";
		char[] data = new char[ ]{'S','u','n','B','e','a','m'};
		// constant : compile time get data
		String str = new String( data );
		System.out.println(str);
	}
	
	public static void main1(String[] args) {
		String s1 = new String("SunBeam"); //new String("SunBeam"); : String Instance
		//String Instanced : Heap 
		
		String s2 = "SunBeam";	//"SunBeam" : String constant / Literal
		//String constant / Literal : String Constant/Literal Pool
	}
	
	
}