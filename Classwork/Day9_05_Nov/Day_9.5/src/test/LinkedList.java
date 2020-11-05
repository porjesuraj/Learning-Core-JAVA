package test;

class Node{
	int data;
	Node next; //null
	
	public Node(int data) {
		this.data = data; 
	}
}


public class LinkedList {

	Node head;
	Node tail;
	
	public boolean empty() {
		
		return this.head == null; 
	}
	
	public void addLast(int element)
	{
		Node newNode = new Node(element);
		if(this.empty())
		 this.head = newNode;
	  else
	this.tail.next = newNode;
this.tail = newNode; 
	}	

	public void printList() {
		Node trav = this.head;
		while(trav != null)
		{
			System.out.println(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}
		
	
	
	
}




	













