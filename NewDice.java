package min;
import java.util.Random;

public class NewDice {

	public static void main(String[] args) {
		int dice[] = new int[6];
		
		for(int i = 0; i < 10000; i++)
		{
			Random r = new Random();
			int k = r.nextInt(6);
			dice[k]++;
		}
		
		for(int i = 0; i < dice.length; i++)
		{
			System.out.println((i + 1) + " " + dice[i]);
		}

	}

}
