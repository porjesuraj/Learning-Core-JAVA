package test;

import java.util.ArrayList;
import java.util.Date;

class Box{
	private Object object; //null
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
public class Program {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("DAC");
		String str = list.get(0);
		System.out.println(str);
	}
	public static void main4(String[] args) {
		Box b4 = new Box();
		b4.setObject(new Date());
		//String str =  (String) b4.getObject(); //ClassCastException
		//System.out.println(str);
		
		Date date = (Date) b4.getObject(); //OK
		System.out.println(date.toString());
	}
	public static void main3(String[] args) {
		Box b3 = new Box();
		Date date = new Date();
		b3.setObject(date);	//Upcasting
	}
	public static void main2(String[] args) {
		Box b2 = new Box();
		int number = 10;
		b2.setObject(number);	//Auto-Boxing and Upcasting	
		//b2.setObject(Integer.valueOf(number));
	}
	public static void main1(String[] args) {
		Box b1 = new Box();
	}
}
