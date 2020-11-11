package test;


class CThread extends Thread{
	
	public CThread(String name) {
		super(name); 
		System.out.println(this.getName()+"	:	"+this.getState());
		this.start();
	}
	
	@Override
	public void run() {
		System.out.println(this.getName()+"	:	"+this.getState());
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println(this.getName()+"	:	"+count);
				if(  count == 5 )
					return;
					//throw new InterruptedException();
				Thread.sleep(500);
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause);
		}	
		
	}
}


public class Program {
	
public static void main(String[] args) {
	
	try {
		Thread thread = new CThread("User Thread");
		
		while(thread.isAlive())	
		{
			
			System.out.println("inside while" + thread.getName() + " : " + thread.getState());
		Thread.sleep(100);
		
		}
		System.out.println("after while" + thread.getName() + " : " + thread.getState());

	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
   }
}













