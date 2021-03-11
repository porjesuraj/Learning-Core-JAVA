package test;

import java.util.ArrayList;
import java.util.Date;

class Box<T extends Number>{ //T extends Number : Bounded Type Parameter
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
		
		Box<Number> b1 = new Box<>();
		
		Box<Integer> b2 = new Box<>();
		
		Box<Double> b3 = new Box<>();
		
		//Box<Character> b4 = new Box<>();
		
		//Box<String> b5 = new Box<>();
		
		//Box<Date> b6 = new Box<>();
	}
}
