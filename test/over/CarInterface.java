package over;

public interface CarInterface {
	final int Timeout = 10000;
	void start();
	void stop();
	public int setSpeed(int speed);
	public int turn(int speed);
}
