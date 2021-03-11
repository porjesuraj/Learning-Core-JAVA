package test;


class CThread extends Thread{
	
	public CThread(String name) {
		super(name); 
		this.start();
	}
	
	@Override
	public void run() {
		System.out.println("Inside Business Logic Method");
	}
}


public class Program {
	
public static void main(String[] args) {
	
	Thread t1 = new CThread("A"); 
	Thread t2 = new CThread("B");
	Thread t3 = new CThread("C");
}
	
	
	
	
}













