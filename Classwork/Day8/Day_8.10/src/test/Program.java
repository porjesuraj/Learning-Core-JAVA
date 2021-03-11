package test;

import java.util.Date;
//Parameterized Type => Generics
class Box<T>{	//T : Type Parameter
	private T object; //null
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
}
public class Program {
	public static void main(String[] args) {
		//Box<int> box = new Box<>( );	//Not OK
		Box<Integer> box = new Box<>( );
		box.setObject(10);
		Integer number = box.getObject();
	}
	public static void main2(String[] args) {
		Box box = new Box();	//Raw Type : Box
		//Box<Object> box = new Box<>();
	}
	public static void main1(String[] args) {
		//Box<Date> box = new Box<Date>();	//Date : Type Argument
		
		Box<Date> box = new Box< >();	//Date : Type Argument
		
		box.setObject(new Date());
		
		Date date =  box.getObject(); //OK
		
		System.out.println(date);
	}
}
