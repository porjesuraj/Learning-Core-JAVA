package test;
@FunctionalInterface
interface Printable{
	void print( );
}
public class Program {
	public void displayRecord( ) {
		System.out.println("Inside print");
	}
	public static void main(String[] args) {
		Program prog = new Program();
		Printable p = prog::displayRecord;
		p.print();
	}
	public static void showRecord( ) {
		System.out.println("Inside print");
	}
	public static void main4(String[] args) {
		Printable p = Program::showRecord;
		p.print();
	}
	public static void main3(String[] args) {
		Printable p = ()->System.out.println("Inside print");
		p.print();
	}
	public static void main2(String[] args) {
		Printable p = new Printable() {
			@Override
			public void print() {
				System.out.println("Inside print");
			}
		};
		p.print();
	}
	public static void main1(String[] args) {
		class Test implements Printable{
			@Override
			public void print() {
				System.out.println("Inside print");
			}
		}
		
		Printable p = new Test( );
		p.print();
	}
}
