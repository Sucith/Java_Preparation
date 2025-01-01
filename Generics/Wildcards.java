package Generic;

import java.util.Arrays;

public class Wildcards<T extends Number>{		// wildcards
	private Object[] data;
	private static int DEFAULT_SIZE =10;
	private int size=0;
	public Wildcards(){
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
		Wildcards<Integer> list = new Wildcards<>();			// in the previous program(Generics) if we wanna add an integer we declare the arraylist Integer
		for(int i=0 ; i<10 ; i++) {							// the same goes for Float, double,long etc.. where these are bound to the Number class
			list.add(i*2);									// so using the Wildcards concept we restrict the type to the numbers class
		}
		System.out.println(list);
		
		Wildcards<Float> list1 = new Wildcards<>();
		for(float j=0;j<5;j++) {						// here we can add both int and float without changing the type every time using wildcards
			list1.add(j);
		}
		System.out.println(list1);
	}
}
