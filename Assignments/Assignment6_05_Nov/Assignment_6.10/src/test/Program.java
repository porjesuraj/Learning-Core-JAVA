package test;

import java.util.Scanner;

public class Program {
	
	
		
	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Please enter a five letter word"); 
		
		String input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {             
		    for (int j = 0; j < input.length(); j++) {         
		        for (int k = 0; k < input.length(); k++) {     
		            if (i == j || i == k || j == k)
		            	continue; 
		            
		            System.out.printf("%c%c%c\n", input.charAt(i), input.charAt(j), input.charAt(k));
		        }
		    }
		}
		
	}
	 

}


/*10. (Creating Three-Letter Strings from a Five-Letter Word)
Write an application that reads a five-letter word from the user
and produces every possible three-letter string that can be
derived from the letters of that word. For example, the three-
letter words produced from the word “bathe” include “ate,”
“bat,” “bet,” “tab,” “hat,” “the” and “tea.*/










