package Interfaces;
//now this class car can inherit more than one interfaces
public class Car implements Engine,brake , Media {   // unless here the media is not implemented the object called is done smoothly.
											// but here both car and media contains the start and stop methods in common but the content inside it is different 
	@Override								// so when the either if the methods are called in the main function the compiler gets confused which method to call either car's or media's
	public void brake() {					// This is why seperate class for interface is necessary
		System.out.println("Brakes like normal car");
	}

	@Override
	public void start() {
		System.out.println("START - ENGINE"); 
	}

	@Override
	public void stop() {
		System.out.println("STOP - ENGING");
	}

	@Override
	public void acc() {
		System.out.println("ACCELERATE");
	}		
}
