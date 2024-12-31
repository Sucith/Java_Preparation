package Thread;
// This is another method of creating the threads.
// we all know that the threads generally extends the Thread class , if it does so then it cannot inherit any other classes because JAVA does'nt support Multiple Inheritance
// So we use the Runnable Interface
class aa implements Runnable{
	public void run() {
		for(int i=0 ; i<=5 ; i++) {
			System.out.println("Hi");
			try {
                Thread.sleep(100); // Add a small delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}

class bb implements Runnable{
	public void run() {
		for(int i=0; i<=5 ;i++) {
			System.out.println("Sucith");
			try {
                Thread.sleep(100); // Add a small delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Runnable obj1 = new aa();		// First we create the object using the reference of the interface
		Runnable obj2 = new bb();
		
		Thread t1 =new Thread(obj1);	// then create a thread using that respective object			
		Thread t2 = new Thread(obj2);
		
		t1.start();						// call the thread using start method
		  try {
              Thread.sleep(10); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
		t2.start();
	}
}
