package test;

class Task implements Runnable{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());//New
		System.out.println("Inside business logic method");
	}
	
	
}

public class Program {
	
public static void main(String[] args) {
	
	Runnable target = new Task(); // upcasting
	Thread th1 = new Thread(target, "User-Thread-1");
	th1.start();	  //RUNNABLE
	
	Thread th2 = new Thread(target, "User-Thread-2");
	th2.start();	  //RUNNABLE
	Thread th3 = new Thread(target, "User-Thread-3");
	th3.start();	  //RUNNABLE
}
	
	
	
	public static void main2(String[] args) {
		Runnable target = new Task(); // upcasting
		
		Thread th = new Thread(target, "User-Thread-0");
		//th.setName("UserThread-0");
		th.start();	  //RUNNABLE
	//	th.start();	 //IllegalThreadStateException
		
	}
	
	
	public static void main1(String[] args) {
	
		Thread th = new Thread();
		
		System.out.println(th.getState()); // NEW
		
	}
}













