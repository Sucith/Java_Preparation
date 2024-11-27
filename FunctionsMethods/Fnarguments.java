package functionsAndMethods;
import java.util.Scanner;
public class Fnarguments {
	public static void main(String[] args) {
		int ans = sum(10,100);					// The value is called here.
		System.out.println(ans);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		String ans1=in.next();
		String Stringans=greet(ans1);
		System.out.println(Stringans);
	}
	static int sum(int a, int b) {				// Here the value inside the function is called arguments. 
		int sum=a+b; 							// They are used in case if we need to write code without scanner classes.
		return sum;
	}
	static String greet(String name) {
		String message="Hi "+name;
		return message;
	}
}
