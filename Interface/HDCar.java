package over;

public class HDCar implements CarInterface{
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	
	public void stop() {
		System.out.println("자동차를 정지합니다.");
	}
	
	public int setSpeed(int speed)
	{
		System.out.println("자동차가 속로를 " + speed +"km/h로 바꿉니다.");
		
		return 1;
	}
	
	public int turn(int degree)
	{
		System.out.println("자동차가 속로를 " + degree +"도 만큼 바꿉니다.");
		
		return 1;
	}
}
