package test;
class Task implements Runnable{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());
		//System.out.println("Inside run()");
	}
}
public class Program {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());
		
		Runnable target = new Task();
		target.run();
	}
}
