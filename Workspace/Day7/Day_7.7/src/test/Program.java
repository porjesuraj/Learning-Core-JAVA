package test;

public class Program {
	public static void showRecord( ) {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void displayRecord( ) throws InterruptedException {
		for( int count = 1; count <= 10; ++ count ) {
			System.out.println("Count	:	"+count);
			Thread.sleep(250);
		}
	}
	public static void main(String[] args){
		//Program.showRecord();
		
		try {
			Program.displayRecord();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
