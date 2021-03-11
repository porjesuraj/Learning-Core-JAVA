package test;

public class Program {
	public static void main(String[] args) {
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
	public static void main1(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());	//Thread[main,5,main]
		//main : Thread Name
		//5	   : Thread Priority
		//main : Thread Group
	}
}
