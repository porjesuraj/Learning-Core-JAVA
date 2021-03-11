package test;

public class Program {
	public static void main4(String[] args) {
		Thread thread = Thread.currentThread();
		//thread.setPriority(Thread.NORM_PRIORITY + 6 );	//IllegalArgumentException
		//thread.setPriority(Thread.NORM_PRIORITY - 6 );	//IllegalArgumentException
	}
	public static void main3(String[] args) {
		Thread thread = Thread.currentThread();
		//thread.setPriority(thread.getPriority() + 3 );
		thread.setPriority(Thread.NORM_PRIORITY + 3 );
		System.out.println(thread.getPriority());
	}
	public static void main2(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getPriority());
	}
	public static void main1(String[] args) {
		System.out.println(Thread.MIN_PRIORITY);	//1
		System.out.println(Thread.NORM_PRIORITY);	//5
		System.out.println(Thread.MAX_PRIORITY);	//10
	}
}