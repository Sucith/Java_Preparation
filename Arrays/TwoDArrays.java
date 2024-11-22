package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArrays {
	public static void main(String[] args) {
//		int[][] arr=new int[2][];  // here this is one way of declaring the 2d arrays. the frist bracket indicates rows and it is mandatory to be filled. Second bracket indicates columns and is is not necessary to be filled
		int [] [] arr1= {
				{1,2,3},			// this is valid
				{4,5,6},
				{7,8,9}
		};
		
		int[][] darray= {
				{1,2,3},	//0th index			// this is also valid
				{4,5},		//1stindex
				{6,7,8,9}	//2nd index  array[1]=> {4,5} array[0][2]=>{3}
		};
		
		Scanner in = new Scanner(System.in);
		int[][] arr= new int[3][3];
		
		//input
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=in.nextInt();
			}
		}
		
		//output
		
		// one way
		System.out.println("basic method");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.println(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		// second method
		System.out.println("using tostring");
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		
		//third method
		System.out.println("Using enhanced for loop");
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
