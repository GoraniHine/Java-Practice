package min;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		int x = 0, y = 0;;
		int dice[] = new int[6];
		
		while(y < 10000)
		{
			Random r = new Random();
			x = r.nextInt(6) + 1;
			
			if (x == 1)
				dice[0]++;
			else if (x == 2)
				dice[1]++;
			else if (x == 3)
				dice[2]++;
			else if (x == 4)
				dice[3]++;
			else if (x == 5)
				dice[4]++;
			else if (x == 6)
				dice[5]++;
			
			y++;
		}
		
		System.out.println("=====================");
		System.out.println("면  빈도");
		System.out.println("=====================");
		System.out.println("1  " + dice[0]);
		System.out.println("2  " + dice[1]);
		System.out.println("3  " + dice[2]);
		System.out.println("4  " + dice[3]);
		System.out.println("5  " + dice[4]);
		System.out.println("6  " + dice[5]);
		

	}

}
