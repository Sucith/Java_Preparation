package functionsAndMethods;

import java.util.Arrays;

public class Overloading {
	public static void main(String[] args) { 
		fun(712);
		fun("ADAAR");
		fun("SUCITH");
		fun(0712);
		num(1,2,3,4,5);
		num("ADDAR","SUCITH","BOBBY");
	}
	
	static void fun(int a) {
		System.out.println(a);					// Two functions with same name can run only if the arguments are different
	}																		
	static void fun(String name) {
		System.out.println(name);
	}
	static void num(int ...num) {
		System.out.println(Arrays.toString(num));  // Same in VarArgs
	}
	static void num(String ...naam) {
		System.out.println(Arrays.toString(naam));
	}
}