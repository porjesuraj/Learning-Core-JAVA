package test;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Program {
	public static void main1(String[] args) {
		//TODO : Enumeration<Integer>
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		Integer element = null;
		Enumeration<Integer> e = v.elements();
		while( e.hasMoreElements()) {
			element = e.nextElement();
			System.out.println(element);
		}
	}
	public static void main2(String[] args) {
		//TODO : Iterator<Integer>
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		Integer element = null;
		Iterator<Integer> itr = v.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
	}
	public static void main3(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		Integer element = null;
		ListIterator<Integer> itr = v.listIterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.print(element+"	");
		}
		System.out.println();
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		Integer element = null;
		ListIterator<Integer> itr = v.listIterator(v.size());
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
}
