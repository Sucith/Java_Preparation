package Interfaces;

public interface Engine {
	static final int price = 78000;
	void start();
	void stop();		// interface methods has no body and they are overridden by their child class's
	void acc();
}
