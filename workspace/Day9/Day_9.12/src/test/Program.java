package test;

import java.util.Arrays;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		String str = "Pune-";
		str = str + new Date();
		System.out.println(str);	//OK
	}
	public static void main3(String[] args) {
		String str = "Pune-";
		str = str + "India";
		System.out.println(str);	//OK
	}
	public static void main2(String[] args) {
		String str = "Pune-";
		str = str + 411056;
		System.out.println(str);	//OK
	}
	
	
	
	
	public static void main1(String[] args) {
		String s1 = "Sun";
		System.out.println(s1);	//Sun
		
		String s2 = s1.concat("Beam");
		System.out.println(s2);	//SunBeam
		
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output :  Not Equal
	}
	
}
