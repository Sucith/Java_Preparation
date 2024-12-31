package Interfaces;

public class Nicecar {
	private Engine engine;
	private Media player = new CDPlayer();
	public Nicecar() {
		engine = new powerengine();
	}
	
	public Nicecar(Engine engine) {
		this.engine= engine;
	}
	
	public void start() {
		engine.start();
	}
	 
	public void stop() {
		engine.stop();
	}
	
	public void startmusic() {
		player.start();
	}
	
	public void stopmusic() {
		player.stop();
	}
	public void upgrageengine() {
		this.engine=new  electengine();
	}
}
