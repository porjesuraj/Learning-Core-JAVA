package test;


public class Program {
	
	
	 public static void main(String[] args) {
		    Stack theStack = new Stack(10); 
		      theStack.push(10);
		      theStack.push(20);
		      theStack.push(30);
		      theStack.push(40);
		      theStack.push(50);
		      
		      while (!theStack.isEmpty()) {
		         long value = theStack.pop();
		         System.out.print(value);Q.5 Write a class to simulate a Queue.
		         System.out.print(" ");
		      }
		      System.out.println("");
		   }
		}




