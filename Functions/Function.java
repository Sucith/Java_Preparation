package Function;
import java.util.Scanner;
public class Function {
	public static void main(String[] args) {
		myMethod();							// This is the function call
		int answer = myMethod2();
		System.out.println("sum:"+answer);	// return types can be called through this way
		paraMethod(20,80);					// the value to be computed is put inside the function call in case of use of parameters
		
		Scanner inp = new Scanner (System.in);	// User input 
		System.out.println("Enter your name:");
		String naam=inp.next();
		String message= paraMethod2(naam);
		System.out.println(message);
	}
	
	public static void myMethod() {			// This function is of return type void (i.e) it returns nothing(no value) Just prints.
		System.out.println("This is of void return type");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num 1:");
		int num1=in.nextInt();
		System.out.println("Enter num 2:");
		int num2=in.nextInt();
		int sum = num1+num2;
		System.out.println("Sum:"+sum);		// Just printing the output
	}
	
	public static int myMethod2() {			// Here the return type is of integer
		System.out.println("This is of int return type");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num 1:");
		int a=in.nextInt();
		System.out.println("Enter num 2:");
		int b=in.nextInt();
		int sum = a+b;
		return sum;						// Because here an integer is returned
//		System.out.println("This statement will never execute"); // Because it is after the return statement
	}
	
	// Parameters
	public static void paraMethod(int a, int b) {
		System.out.println("Parameters eg no1");
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static String paraMethod2(String name) {
		System.out.println("Here the parameter is of type String");
		String greet = "How are ya? " + name;
		return greet;
	}
}
