package Functions;

public class Method {
	public static void main(String [] args) {
		Comp obj = new Comp();
		obj.Display();
		int age = obj.Age(16);
		System.out.println(age);
	}
	
	public static class Comp{
		public void Display(){		// method of void type
			System.out.println("HI all");
		}
		
		public int Age(int age) {	// method of int return type
			return age;
		}
	}
}
