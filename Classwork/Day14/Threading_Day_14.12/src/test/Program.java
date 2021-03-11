package test;

class CThread extends Thread{
	public CThread( String name ) {
		this.setName(name);
		this.start();
	}
	@Override
	public void run() {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println(this.getName()+"	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			Thread th1 = new CThread("A");
			th1.join();
			
			Thread th2 = new CThread("B");
			th2.join();
			
			Thread th3 = new CThread("C");
			th3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
