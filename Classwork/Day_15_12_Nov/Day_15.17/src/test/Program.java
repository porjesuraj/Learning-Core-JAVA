package test;

@FunctionalInterface
interface Printable{
	void print( );
}
class Test implements Printable{
	@Override
	public void print() {
		System.out.println("Inside print");
	}
}
public class Program {
	
	public static void main(String[] args) {
	Printable p = new Test();
	p.print();
  }

} 







