package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int number = sc.nextInt();
		// sum of digits
		int result = Program.sumOfDigits(number);
		System.out.println("sum of digits =  " + result);
		
       // reverse no
		int reverse = Program.reverseNumber(number);
		System.out.println("reverse of number =  " + reverse);
		
		// palindrome
		
		Program.checkForPalindrome(number, reverse);
		
		// perfect no
		
		Program.CheckPerfectNumber();
		
		//Armstrong no
		
		Program.CheckArmstrongNumber();
		
		
		// get Prime Number
		Program.GetPrimeNo();
	}
	
	public static int sumOfDigits(int i)
	{

		
		
		int temp = 0 ;
		int result = 0;
		while(i != 0)
		{
			temp = i % 10;
			
			result += temp;
			
			i = i/10;
		}
		
		return result;
		
	}
	
	public static int reverseNumber(int i)
	{

		
		
		int reversed = 0;
		
		int digit = 0;
		
		while(i != 0)
		{
			digit = i % 10;
			
			reversed = reversed * 10 + digit;
			
			i = i/10;
		}
		
		return reversed;
	}
	
	public static void checkForPalindrome(int number,int reversed)
	{
		if(number == reversed)
		{
			System.out.println("Number = " + number + " is a palindrome" );
		}
		else
		{
			System.out.println("Number = " + number + " is not a palindrome" );
		}
		
	}
	
	public static void CheckPerfectNumber()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number, check  perfect number");
		int num = sc.nextInt();
		
		
		
		int i = 1;
		int temp = num;
		int divisor = 0;
		int result = 0;
		while(i!= num)
		{
			if(num % i == 0)
			{
				result += i; 
			}
			
			i++;
			
		}
		
		if(result == temp)
		{
			System.out.println("Number = " + temp + " is a perfect number" );
		}
		else
		{
			System.out.println("Number = " + temp + " is not a perfect number" );
		}
	}
	
	public static void checkStrongNumber()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number, check for strong number");
		int n = sc.nextInt();
		int i;
		int fact,rem;
		int sum = 0;
		int temp = n;
		while(n != 0)
		{
		i = 1;
		fact = 1;
		rem = n % 10;

		while(i <= rem)
		{
		fact = fact * i;
		i++;
		}
		sum = sum + fact;
		n = n / 10;
		}

		if(sum == temp)
		System.out.println(temp + " is a strong number\n");
		else
		System.out.println(temp + " is not a strong number\n");

		System.out.println();
		}
	
	public static void CheckArmstrongNumber()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number, check for Armstrong number");
		int n = sc.nextInt();
		int temp = n;
		int digit,cube = 0;
		int result = 0;
		while(n != 0)
		{
			digit = n % 10;
			
			cube = digit * digit * digit; 
			
		
			result += cube;
			
		    n = n/10;
		    
		}
		if(result == temp)
			System.out.println(temp + " is a Armstrong number\n");
			else
			System.out.println(temp + " is not a  Armstrong number\n");

			
	}
		
	public static void GetPrimeNo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number, till which number you want prime numbers");
		int number = sc.nextInt();
		
		int primeCheckNumber;
		  int n = 1;
		  int divisibleCount;

		  while (n <= number) {
		   divisibleCount = 0;
		   primeCheckNumber = 2;
		   while (primeCheckNumber <= n / 2) {
		    if (n % primeCheckNumber == 0) {
		     divisibleCount++;
		     break;
		    }
		    primeCheckNumber++;
		   }
		   if (divisibleCount == 0 && n != 1) {
		    System.out.print(n + " ");
		   }
		   n++;
		  }
		
	}
		
}	




/*3. Accept one integer number from command line and provide the
following functionalities
• Sum of digits. [e.g. for 1234 , 1 + 2 + 3 + 4 = 10]
• Reverse number [e.g. for 1234 ,4321]
• Check weather given number is palindrome or not.
[Check reverse and original no. are same or not]

•
Perfect number.
28 = 1 + 2 + 4 + 7 + 14
[Perfect number is a positive integer that is the sum of
its proper positive divisors]
•
Strong number. 145=> 1! + 4! + 5! = 1 + 24 + 120 = 145
[The sum of the factorials of digits of a number is equal to
the original number.]
•
Armstrong number. 153 => 1 3 + 5 3 +3 3 = 1+125+27= 153
[The sum of the cubes of digits of a number is equal to the
original number.]

•
1
Prime number. 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
[A prime number is a natural number that has exactly two
distinct natural number divisors: 1 and itself.]


*/