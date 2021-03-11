package test;


class Singleton{
	
	private int number;
	
	private Singleton()
	{
		this.number = 0;
		System.out.println("Inside constructor");
	}

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}
	private static Singleton instance = null;
	public static Singleton getInstance() {
		
		if(instance == null)
		instance = new Singleton();
	     return instance;
		
		
	}
	
}





public class Program {
	
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}
}
	

            