package test;

class Task implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Inside business logic method");
	}	
}

class CThread{
	
	private Thread thread;
	
	public CThread(String name) {
		Runnable target = new Task();
		
		this.thread = new Thread(target, name);
		
		this.thread.start();
	}
}
public class Program {
	
public static void main(String[] args) {
	CThread th1 = new CThread("A");
	CThread th2 = new CThread("B");
	CThread th3 = new CThread("C");
	
}
	
	
	
	
}













