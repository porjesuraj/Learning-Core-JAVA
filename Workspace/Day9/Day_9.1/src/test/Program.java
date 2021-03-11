package test;

import java.util.ArrayList;

public class Program {

	private static ArrayList<Integer> getIntegerList(){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		return list;
		
	}
	
private static ArrayList<Double> getDoubleList(){
		
		ArrayList<Double> list = new ArrayList<>();
		
		list.add(10.1);
		list.add(20.1);
		list.add(30.1);
		
		return list;
		
	}

private static ArrayList<String> getStringList(){
	
	ArrayList<String> list = new ArrayList<>();
	
	list.add("A");
	list.add("B");
	list.add("C");
	
	return list;
	
}


private static void showIntegerList(ArrayList<Integer> list)
{
	if(list != null)
	{
		
		for(Integer element : list)
		{
			System.out.println(element);
		}
	}
}

private static void showDoubleList(ArrayList<Double> list)
{
	if(list != null)
	{
		
		for(Double element : list)
		{
			System.out.println(element);
		}
	}
}

private static void showStringList(ArrayList<String> list)
{
	if(list != null)
	{
		
		for(String element : list)
		{
			System.out.println(element);
		}
	}
}








	public static void main(String[] args) {
		
		ArrayList<Integer> list = Program.getIntegerList();
		
		Program.showIntegerList(list);;
		
		ArrayList<Double> list2 = Program.getDoubleList();
		
		Program.showDoubleList(list2);

		ArrayList<String> list3 = Program.getStringList();
		Program.showStringList(list3);
		
		
		
	}
	public static void main1(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add( 10 );
		list.add( 20 );
		list.add( 30 );
		
		for( Integer element : list )
			System.out.println(element);
	}

}
