package test;

public class Queue {
	 private static int front, rear, capacity; 
	    private static int queue[]; 
	   
	   public Queue(int size) { 
	        front = rear = 0; 
	        capacity = size; 
	        queue = new int[capacity]; 
	    } 
	   
		// insert an element into the queue
	  public void queueEnqueue(int item)  { 
	        // check if the queue is full
	        if (capacity == rear) { 
	            System.out.printf("\nQueue is full\n"); 
	            return; 
	        } 
	   
	        // insert element at the rear 
	        else { 
	            queue[rear] = item; 
	            rear++; 
	        } 
	        return; 
	    } 
	   
	    //remove an element from the queue
	  public  void queueDequeue()  { 
	        // check if queue is empty 
	        if (front == rear) { 
	            System.out.printf("\nQueue is empty\n"); 
	            return; 
	        } 
	   
	        // shift elements to the right by one place uptil rear 
	        else { 
	            for (int i = 0; i < rear - 1; i++) { 
	                queue[i] = queue[i + 1]; 
	            } 
	   
	       
	      // set queue[rear] to 0
	            if (rear < capacity) 
	                queue[rear] = 0; 
	   
	            // decrement rear 
	            rear--; 
	        } 
	        return; 
	    } 
	   
	    // print queue elements 
	  public void queueDisplay() 
	    { 
	        int i; 
	        if (front == rear) { 
	            System.out.printf("Queue is Empty\n"); 
	            return; 
	        } 
	   
	        // traverse front to rear and print elements 
	        for (i = front; i < rear; i++) { 
	            System.out.printf(" %d , ", queue[i]); 
	        } 
	        return; 
	    } 
	   
	    // print front of queue 
	  public void queueFront() 
	    { 
	        if (front == rear) { 
	            System.out.printf("Queue is Empty\n"); 
	            return; 
	        } 
	        System.out.printf("\nFront Element of the queue: %d", queue[front]); 
	        return; 
	    } 
	} 