package functionsAndMethods;

public class Shadowing {
	static int x=10;							// This value is shadowed by the line 8
	public static void main (String[] args) {
		System.out.println(x);					//original value
		int x=30;								// the class variable at line 4 is shadowed by this line new value
		System.out.println(x);
		fun();
	}
	static void fun() {
		System.out.println(x);					// this takes the original value because ne new value's scope ends above
	}
}
