package org.sunbeam.dac;



public class ShapeFactory {
	public static Shape getInstance(int choice) {
		Shape shape = null;
		switch (choice) {
		case 1:
			shape = new Rectangle(); // Upcasting
			break;
		case 2:
			shape = new Circle(); // Upcasting
			break;
		}
		return shape;
	}
}