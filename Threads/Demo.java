package Thread;

class A extends Thread{			// Here the class that are bound to threads stay out of the main class and remain as THREADS
	public void run() {
		for(int i=0 ; i<=5 ; i++) {
			System.out.println("hi"); // Here the output is executed simultaneouly but we cant see that. so we hold the priting for a certain amount of time using Sleep
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
	
class B extends Thread{
	public void run() {
		for(int i=0 ; i<=5 ; i++) {
			System.out.println("Sucith"); 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {e.printStackTrace();}

		}
	}
}

public class Demo{
	public static void main(String [] args) {
		A obj1 = new A();
		B obj2=new B();
		obj1.start();
		try {Thread.sleep(5);} catch(InterruptedException e) {e.printStackTrace();}
		obj2.start();
	}
}