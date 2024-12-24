package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayInput {
	public static void main(String [] args) {
		//Normal way of input
		int[] rno=new int[5];
		rno[0]=61;
		rno[2]=62;
		rno[3]=63;
		rno[4]=64;
		rno[1]=65;
		System.out.println(rno[4]);
		
		// Using for loop and user input
		Scanner in = new Scanner(System.in);
		int[] rnos=new int[5];
		for(int i = 0;i<rnos.length;i++) {
			rnos[i]=in.nextInt();
		}
		for(int i = 0;i<rnos.length;i++) {
			System.out.println(rnos[i]);
		}
		
		//using foreach loop
		System.out.println();
		for(int num : rnos) {			// for(every element in the array : print the element)
			System.out.println(num);
		}
		
		// using arrays.tostring method
		System.out.println();
		System.out.println(Arrays.toString(rnos));
		
		// Array of objects
		String[] name = new String[5];
		for(int i =0 ;i<name.length;i++) {
			name[i]=in.next();
		}
		System.out.println(Arrays.toString(name));
	}
}
