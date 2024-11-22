package arraysandArrayList;

import java.util.Arrays;

public class ArraysndFunctions {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(Arrays.toString(nums)); // raw value
		change(nums);
		System.out.println(Arrays.toString(nums)); // value is changed
	}
	static void change(int[] arr) {
		arr[0]=100;
	}
}
