package assignment;
/*2. Accept a integer number as Command line argument from the program and
 *  when the program is executed print the binary, 
octal and hexadecimal equivalent of the given number.

Sample Output:

java Test 20 Given Number :20 Binary equivalent :10100 Octal equivalent :24 Hexadecimal equivalent :14

Refer Java Documentation and look for the appropriate Wrapper class method*/

public class program {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(args[0]);
		
		System.out.println("Given Number : " + number);
		
		
		System.out.println(" Binary equivalent : " + Integer.toBinaryString(number));
		
		System.out.println("Octal equivalent : " + Integer.toOctalString(number));
		
		System.out.println("Hexdecimal equivalent : " + Integer.toHexString(number));
		
		
	}

}
