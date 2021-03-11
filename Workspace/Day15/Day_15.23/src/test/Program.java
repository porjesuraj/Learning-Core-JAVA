package test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		
		//void accept(T t)
	//Consumer<Integer> action = ( Integer number )-> System.out.println(number);
		//Consumer<Integer> action = ( number )-> System.out.println(number);
		//Consumer<Integer> action = number -> System.out.println(number);
		//list.forEach(action);
		
		list.forEach(number->System.out.println(number));
	}
}
