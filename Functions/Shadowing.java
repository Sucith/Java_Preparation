package Function;

public class Shadowing {
	static int x=90;
	public static void main(String[] args) {
		System.out.println(x); // this one's value is 90
		int x=10; // at this point the static x's value is shadowed
		System.out.println(x);// this is 10
	}
}
