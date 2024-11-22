package Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[5];  // Creating an array of size 5
        System.out.println("Enter 5 integers:");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();  // Taking user input for each element
            System.out.println("FIRST");
            System.out.println(arr[i]);
        }
        
        System.out.println("Array elements (using for loop):");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("Array elements (using enhanced for loop):");
        for (int num : arr) {
            System.out.println(num);
        }
        
        in.close();
    }
}
