package test;

import java.util.Scanner;

class Test{
	public Test() {
		System.out.println("Inside constructor");
	}
	public void print( ) {
		System.out.println("Inside print");
	}
	@Override
	public void finalize(){
		System.out.println("Inside finalize");
		Thread thread = Thread.currentThread();
		
		String name = thread.getName();
		System.out.println("Name		:	"+name);
		
		int priority = thread.getPriority();
		System.out.println("Priority	:	"+priority);
		
		String groupName = thread.getThreadGroup().getName();
		System.out.println("Group		:	"+groupName);
		
		String state = thread.getState().name();
		System.out.println("State		:	"+state);
		
		boolean type = thread.isDaemon();
		System.out.println("Type		:	"+( type ? "Daemon" : "User"));
		
		boolean status = thread.isAlive();
		System.out.println("Status		:	"+( status ? "Alive" : "Dead"));
	}
}
public class Program {
	public static void main(String[] args) {
		Test t = new Test( );	//Inside constructor
		t.print( );		//Inside print
		t = null;
		System.gc();//Inside finalize
	}
}
