package test;
//top level class


abstract class Shape{
	
	protected float area;
	
	public abstract void calculateArea();
	
	public float getArea() {
		return area; 
	}
	
	
}

public class Program { // Program.class

	public static void main(String[] args) {
	
		Shape sh = new Shape() {
			private float radius = 10;
			
			@Override
			public void calculateArea() {
				
				this.area = (float) (Math.PI * Math.pow(radius, 2));
				
			}
		};

		sh.calculateArea();
		
		System.out.println("Area  : " + sh.getArea());
		
		
	}

}
