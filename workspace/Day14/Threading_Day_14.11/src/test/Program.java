package test;

class CThread extends Thread{
	
	public CThread() {
	 
		this.start();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		//this.setPriority(NORM_PRIORITY + 3 ); 
				System.out.println(this.getName()+"	"+this.getPriority());
	}
}


public class Program {

public static void main(String[] args) {
	
	Thread thread = Thread.currentThread();
	
	thread.setPriority(Thread.NORM_PRIORITY);
	System.out.println(thread.getName()+"	"+thread.getPriority());
	
	
	CThread cthread = new CThread(); 
	
	
	
	
	
	
}
}