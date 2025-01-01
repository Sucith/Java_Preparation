package Generic;

import java.util.Arrays;

public class Generics<T>{
	private Object[] data;
	private static int DEFAULT_SIZE =10;
	private int size=0;
	public Generics() {
		this.data=new Object[DEFAULT_SIZE];
	}
	// Adding the elements into the Custom Arraylist.
	public void add(T num) {
		if(isFull()) {
			resize();
		}
		data[size++]=num;
	}
	private void resize() {
		Object[] temp = new Object[DEFAULT_SIZE*2];
		for(int i=0 ; i<data.length ;i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	private boolean isFull() {
		return size==data.length;
	}
	// removing an element
	public T remove() {
		T removed = (T) data[size--];
		return removed;
	}
	// get the element
	public T get(int index) {
		return (T) data[index];
	}
	// set the value
	public void set(int index, T value) {
		data[index]=value;
	}
	@Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(Arrays.copyOf(data, size)) + '}';
    }
	
	public static void main(String[] args) {
		Generics<Integer> list = new Generics<>();		// In the previous prgrm we didnt have <> . <> are generics
		for(int i=0 ; i<=15 ;i++) {
			list.add(i*2);
		}
		System.out.println(list);
//		list.add("run");// error because cant add strings
	}
}
