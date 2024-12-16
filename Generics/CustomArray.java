package Generics;

import java.util.ArrayList;				//HERE WE INITIALIZE THE TYPE OF DATA TO BE ADDED IN THE ARRAYLIST DURING THE CREATION OF ARRAY
import java.util.Arrays;				// THIS MAKES IT INEFFICIENT 

public class CustomArray {
	private int [] arr;					//Array Creation
	private static int DEFAULT_SIZE=10;		
	private int size =0;
	
	CustomArray(){
		this.arr=new int [DEFAULT_SIZE];	
	}
	//list.add();
	public void add(int num) {		// undergoing the list.add in the functions format
		if(isfull()) {
			resize();
		}
		arr[size++]=num;
	}
	
	private void resize() {
		int [] temp = new int [DEFAULT_SIZE * 2];	// Every time the resize hits the new array is created of double the size of previous array.
		for(int i = 0 ; i < arr.length; i++) {
			temp[i]= arr[i];
		}
		arr = temp ;
	}

	private boolean isfull() {
		return size==arr.length;
	}
	
	//list.remove()
	public int remove() {
		int removed = arr[--size];
		return removed;
	}
	
	//list.get()
	public int get(int index) {
		return arr[index];
	}
	
	//list.set()
	public void set(int index , int value) {
		arr[index] = value;
	}
	
	
	
	@Override
	public String toString() {
		return "CustomArray [arr=" + Arrays.toString(arr) + ", size=" + size + "]";
	}
	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		
		CustomArray list = new CustomArray();
//		list.add(3);
//		list.add(4);
//		list.add(2);
		for(int i = 0 ; i<15; i++) {
			list.add(2*i);
			}
		System.out.println(list);
	}
}
