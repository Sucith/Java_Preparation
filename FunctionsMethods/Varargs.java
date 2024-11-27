package functionsAndMethods;
import java.util.Arrays;
public class Varargs {
	public static void main(String[] args) {
		nums(1,2,3,4,2,2,2,3,3,32,3233,232323,234);
		mixed(7,12,"Sucith","Adaar");
	}
	static void nums(int ...n) {							// Here the ...n is the variable arguments where n number of arguments can be created
		System.out.println(Arrays.toString(n));
	}
	static void mixed(int a , int b, String ...names) {		// in case of mixed datatypes in the variable 
		System.out.println(Arrays.deepToString(names));
	}
}
 