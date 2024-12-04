package Function;

import java.util.Arrays;

public class VarArgs {
	public static void main(String [] args) {
		fun(1,2,3,4,5,7,5,2,4,651,6513218,132191);
		multiple(1,2,"Adaar","Sucith","Balaji","Abbas");
	}
	public static void fun(int ...x) {			// can store n number of arguments
		System.out.println(Arrays.toString(x));
	}
	public static void multiple(int a, int b, String ...v) {
		System.out.println(Arrays.toString(v));
	}
}
