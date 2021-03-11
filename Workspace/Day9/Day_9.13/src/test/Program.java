package test;

import java.util.Arrays;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun";
		String s3 = ( s2 + "Beam" ).intern();
		if( s1 == s3 ) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
	public static void main10(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun";
		String s3 = s2 + "Beam";
		if( s1.equals(s3) ) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main9(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun";
		String s3 = s2 + "Beam";
		if( s1 == s3 ) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	
	public static void main8(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun"+"Beam";	//"SunBeam"
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
	public static void main7(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun"+"Beam";	//"SunBeam"
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
	
	
	public static void main6(String[] args) {
		String s1 = new String("DAC");
		String s2 = "DAC";
		if( s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
	
	
	public static void main5(String[] args) {
		String s1 = new String("DAC"); // heap
		String s2 = "DAC"; // literal area
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : NOT Equal
	}
	
	
	public static void main4(String[] args) {
		String s1 = "DAC";
		String s2 = "DAC";
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal 
	}
	
	
	
	public static void main3(String[] args) {
		String s1 = "DAC";
		String s2 = "DAC";
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal 
	}
	
	
	public static void main2(String[] args) {
		String s1 = new String("DAC");
		String s2 = new String("DAC");
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal 
	}

	
	
	
	public static void main1(String[] args) {
		String s1 = new String("DAC");
		String s2 = new String("DAC");
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal 
	}


}