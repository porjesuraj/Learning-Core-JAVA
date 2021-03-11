package test;

@FunctionalInterface
interface Printable{
	void print(String s );
}
public class Program {
	
	public static void main(String[] args) {
	
		//Printable p = ( String str )-> System.out.println(str);
		//Printable p = ( String message )-> System.out.println(message);
		//Printable p = ( str )-> System.out.println(str);
 
		Printable p = str -> System.out.println("hello " + str);
		p.print("raj");
	}

} 







