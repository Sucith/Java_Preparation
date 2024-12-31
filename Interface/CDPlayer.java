package Interfaces;

public class CDPlayer implements Media{

	@Override
	public void start() {
		System.out.println("START _ MEDIA");
	}

	@Override
	public void stop() {
		System.out.println("STOP_MEDIA");
	}
	
}
