package over;

public interface PhoneInterface {
	final int Timeout = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
