package Inheritance;

public class Polymorphism {
	public static class Shapes{
		void area() {
			System.out.println("I am in shapes");
		}
	}
	
	public static class Circle extends Shapes{
		void area() {
			System.out.println("Area is pi*r*r");
		}
	}
	
	public static class Square extends Shapes{
		void area() {
			System.out.println("Area is side * side");
		}
	}
	
	public static class Triangle extends Shapes{
		void area() {
			System.out.println("Area is l*b*h");
		}
	}
	
	public static void main(String [] args) {
		Shapes shape = new Shapes();
		Circle circle = new Circle();
		Square square= new Square();
		Triangle triangle = new Triangle();
		
		shape.area();
		circle.area();		// this is polymorphism : Act of representing the same thing in multiple ways
		square.area();
		triangle.area();
	}
}	
