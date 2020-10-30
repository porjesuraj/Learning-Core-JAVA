package test;


public class Program {
	
	 public static void main(String[] args) { 
	        
	        Queue q = new Queue(4); 
	   
	        System.out.println("Initial Queue:");
	        
	      
	        q.queueDisplay(); 
	   
	      
	        q.queueEnqueue(10); 
	        
	        q.queueEnqueue(30); 
	        q.queueEnqueue(50); 
	        q.queueEnqueue(70); 
	   
	     
	        System.out.println("Queue after Enqueue Operation:");
	        q.queueDisplay(); 
	   
	       
	        q.queueFront(); 
	         
	        // insert element in the queue 
	        q.queueEnqueue(90); 
	   
	        // print Queue elements 
	        q.queueDisplay(); 
	   
	        q.queueDequeue(); 
	        q.queueDequeue(); 
	        System.out.printf("\nQueue after two dequeue operations:"); 
	   
	        // print Queue elements 
	        q.queueDisplay(); 
	   
	        // print front of the queue 
	        q.queueFront(); 
	    } 
	}