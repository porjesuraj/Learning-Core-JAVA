package assignment;
/*1. Write a java program which generates the minimum and maximum value for each of the Numeric Wrapper classes (Byte, Short, nteger, Long, Float, Double)

Sample Output: 
Integer range: min: -2147483648 max: 2147483647 
Double range: min: 4.9E-324 max: 1.7976931348623157E308 
Long range: min: -9223372036854775808 max: 9223372036854775807 
Short range: min: -32768 max: 32767 
Byte range: min: -128 max: 127 
Float range: min: 1.4E-45 max: 3.4028235E38 */

public class program {

	public static void main(String[] args) {
		
		System.out.println("Integer range : min : " + Integer.MIN_VALUE +
				"   max :  " + Integer.MAX_VALUE);
		
		System.out.println("Double range : min : " +  Double.MIN_VALUE + 
				"   max : " + Double.MAX_VALUE);
		
		System.out.println("Long range : min : " + Long.MIN_VALUE + "  max :" + Long.MAX_VALUE);
		
		System.out.println("Short range min: " + Short.MIN_VALUE + "  max : " + Short.MAX_VALUE);
		
		System.out.println("Byte range : min : " + Byte.MIN_VALUE + "  max : " +  Byte.MAX_VALUE);
		
		System.out.println("Float range : min : " + Float.MIN_VALUE + "  max : " + Float.MAX_VALUE);

	}

}
