package test;

//  a singly linked list
public class LinkedList {
	
	Node head; // head of list

		
		static class Node{
	    int data;
	    Node next;
	    Node(int d)
	    {
	    	this.data = d;
	    	this.next = null;
	    }
	}
	
public static LinkedList insert(LinkedList list,int data)
{
	
	Node new_node = new Node(data); 
	new_node.next = null;
	
	if(list.head == null)
	{
		list.head = new_node; 
		
	} else {
		Node last = list.head;
		while(last.next != null)
		{
			last = last.next;
		}
	}
	
	return list;
	
	
}


public static void printList(LinkedList list) {
	
	Node currNode = list.head;
	
	System.out.println("Linked List: ");
	
	while(currNode != null) {
		
		System.out.print(currNode.data + "");
		
		currNode = currNode.next;
	}
}
		
		
		
		
}


















