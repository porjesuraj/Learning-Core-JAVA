package test;


public class Program {
	
	private static String str = "Hello";
	
	public void print() throws InterruptedException {
		
		synchronized (str) {
			System.out.println(str);
			//this.wait(1000); //IllegalMonitorStateException
			str.wait(1000); //OK
			System.out.println(str);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Program p = new Program();
		p.print();
		
	
	}
}
