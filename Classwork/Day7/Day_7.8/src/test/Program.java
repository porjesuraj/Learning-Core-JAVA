package test;

public class Program {
	public static void main(String[] args) {
		//public static void sleep(long millis) throws InterruptedException
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args){
		//public static int parseInt(String s)throws NumberFormatException
		String str = "125";
		int number = Integer.parseInt(str); //OK
		System.out.println("Number	:	"+number);
	}
}
