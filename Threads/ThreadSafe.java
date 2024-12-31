package Thread;

class Counter{
	int count;
	public synchronized void count() { // The synchronized is used so that the count() method is accessed by one thread at a time
		count++;
	}
}
public class ThreadSafe {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Runnable obj1 = new bb() {
			public void run() {
				for(int i=0 ; i<1000 ;i++) { 	// At times we get the wrong output this is because both the t1 and t2 works on the count() method
					c.count();					// So we use the synchronised keyword	
				}
			}
		};
		
		Runnable obj2 = new bb() {
			public void run() {
				for(int i=0 ; i<1000; i++) {
					c.count();
				}
			}
		};
		
		Thread t1 = new Thread(obj1);	
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}
