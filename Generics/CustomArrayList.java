package Generic;

import java.util.Arrays;

public class CustomArrayList {
	private int[] data;
	private static int DEFAULT_SIZE =10;
	private int size=0;
	public CustomArrayList() {
		this.data=new int[DEFAULT_SIZE];
	}
	// Adding the elements into the Custom Arraylist.
	public void add(int num) {
		if(isFull()) {
			resize();
		}
		data[size++]=num;
	}
	private void resize() {
		int[] temp = new int[DEFAULT_SIZE*2];
		for(int i=0 ; i<data.length ;i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	private boolean isFull() {
		return size==data.length;
	}
	// removing an element
	public int remove() {
		int removed = data[size--];
		return removed;
	}
	// get the element
	public int get(int index) {
		return data[index];
	}
	// set the value
	public void set(int index, int value) {
		data[index]=value;
	}
	@Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(Arrays.copyOf(data, size)) + '}';
    }
	
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();		// here our custom arraylist allows only to store integers
		list.add(2);										// while the internal arraylist allows us to store 
		list.add(4);										// that is using Generics
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		System.out.println(list);
		list.remove();
		System.out.println(list); 	// removes the last index
		list.set(9,20);
		System.out.println(list);
	}
	
}
