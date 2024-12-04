package Function;

public class Swaps {
	public static void main(String [] args) {
		System.out.println("This thro' normal way");
		int a,b,temp;
		a=10;b=20;
		System.out.println(a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap :"+a+" "+b);
		System.out.println();
		
//		 Swapping using functions
		int x, y;
		System.out.println("Using functions");
		x=100;y=200;
		swap(x,y);
		System.out.println(x+" "+y);
		
		// Swapping strings
		String name= "Sucith";
		changeName(name);
		System.out.println();
		System.out.println(name);
	}
	
	public static void swap(int x,int y) {
		int temp =x;
		x=y;			//This wont swap
		y=temp;
	}
	
	public static void changeName(String naam) {
		 naam="Adaar";	// This also wont swap because here the value naam points towards Adaar and not Sucith NO PASS BY REFERENCE ONLY POINT BY VALUE
	}
}
