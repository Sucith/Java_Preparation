package Generics;
											//HERE USING GENERICS WE CAN ADD ANY TYPE OF DATA LIKE THE ARRAYLIST DO 
import java.util.ArrayList;
import java.util.Arrays;
											
public class CustomGenericArray<T> {		//Here T is the type of the data that's gonna be declared during the declaration of the arraylist 	
											//eg:- CustomGenericArray<Integer>  T => Integer
	private Object[] arr;					//Array Creation using Object as the type
	private static int DEFAULT_SIZE=10;		
	private int size =0;
	
	CustomGenericArray(){
		arr=new Object[DEFAULT_SIZE];		//Array of type Object	
	}
	//list.add();
	public void add(T num) {				// the type of num is gonna be T
		if(isfull()) {
			resize();
		}
		arr[size++]=num;
	}
	
	private void resize() {
		Object [] temp = new Object [DEFAULT_SIZE * 2];	// Every time the resize hits the new array is created of double the size of previous array.
		for(int i = 0 ; i < arr.length; i++) {
			temp[i]= arr[i];
		}
		arr = temp ;
	}

	private boolean isfull() {
		return size==arr.length;
	}
	
	//list.remove()
	public T remove() {									
		T removed = (T)(arr[--size]);
		return removed;
	}
	 
	//list.get()
	public T get(int index) {
		return (T)arr[index];
	}
	
	//list.set()
	public void set(int index , T value) {
		arr[index] = value;
	}
	
	
	
	@Override
	public String toString() {
		return "CustomArray [arr=" + Arrays.toString(arr) + ", size=" + size + "]";
	}
	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		
		CustomGenericArray<Float> list = new CustomGenericArray<> ();
//		list.add(3);
//		list.add(4);
//		list.add(2);
		for(int i = 0 ; i<15; i++) {
			list.add((float) (2*i));
			}
		System.out.println(list);
}
}

