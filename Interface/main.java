package Interfaces;

public class main {
	public static void main(String [] args) {
//		Car car = new Car();
//		car.acc();
//		car.start();			// interfaces bound to one single class
//		car.stop();
//		
//		
//		Media carmedia = new Car();
//		carmedia.stop();  // instead of stoping the car media it stops the engine
		
		
		
		Nicecar car = new Nicecar();
		
		car.start();
		car.startmusic();
		car.upgrageengine();
		car.start();
	}
}
