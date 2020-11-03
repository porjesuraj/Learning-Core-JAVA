package test;
public class Program {
	public static void main(String[] args) {
		//Throwable()
		Throwable th1 = new Throwable();	//OK
		
		//Throwable(String message)
		Throwable th2 = new Throwable("This  is exception demo");	//OK
		
		//Throwable(Throwable cause)
		Throwable cause1 = new Throwable("This  is exception demo");	//OK
		Throwable th3 = new Throwable( cause1 );	//OK
		
		//Throwable(String message, Throwable cause)
		Throwable cause2 = new Throwable();	//OK
		Throwable th4 = new Throwable("This  is exception demo", cause2 );	//OK
	}
}