package functionsAndMethods;
import java.util.Scanner;
public class Function {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=in.nextInt();
		System.out.println("Enter num2:");
		int num2=in.nextInt();
		int sum = num1+num2;
		System.out.println("Sum="+ sum);   //This is the normal way of executing a task
		sum();							   // Calling the function sum()
		int ans=sum1();
		System.out.println(ans);
		String op= greet();
		System.out.println(op);
	}
	
	static void sum() {										//This is using functions 
		Scanner in = new Scanner(System.in);				// Here void is the return type i.e it just returns the value that is being generated
		System.out.println("Enter num1:"); 
		int num1=in.nextInt();
		System.out.println("Enter num2:");
		int num2=in.nextInt();
		System.out.println("Enter num3:");
		int num3=in.nextInt();
		int sum = num1+num2+num3;
		System.out.println("Sum="+ sum);  
	}
	
	static int sum1() {
		Scanner in = new Scanner(System.in);				// Here int is the return type (i.e) the output here is returned in other words the output is returned rather printed 
		System.out.println("Enter num1:"); 
		int a=in.nextInt();
		System.out.println("Enter num2:");
		int b=in.nextInt();
		System.out.println("Enter num3:");
		int c=in.nextInt();
		int addition = a+b+c;
		return addition; 								   // return means that the end of the function. Anything that lies after the return statement in the function is not executed.
	}
	
	static String greet() {
		String message="How are you?";
		return message;
	}
}
