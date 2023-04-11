package mao.linatrix;

public class Car {
	// Properties (States)
	private boolean isDoorClosed;		// true
	private String engine;
	private String driver;
	private int speed;
	
	// Functionalities (Behaviours)
	
	// Getter-/Setter-Methods
	public boolean getIsDoorClosed() {
		return isDoorClosed;
	}
	
	public void setIsDoorClosed(boolean isDoorClosed) {
		this.isDoorClosed = isDoorClosed;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
