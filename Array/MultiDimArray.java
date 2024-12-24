package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimArray {
	public static void main(String[] args) {
//		int[][] arr=new int[3][];
//		int[][] arr2d= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//	};
		Scanner in = new Scanner(System.in);
		// input
		int [][] arr= new int [3][3];
		// row wise
		for(int row = 0; row<arr.length;row++) {
			//column wise
			for(int col=0;col<arr[row].length;col++ ) {
				arr[row][col]=in.nextInt();
			}
		}
		
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
}
}