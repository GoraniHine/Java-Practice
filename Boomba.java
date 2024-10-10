package min;
import java.util.Random;

public class Boomba {

	public static void main(String[] args) {
		Random r = new Random();
		int a = 0;
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				a = r.nextInt(10);
				if(a == 0 || a == 1 || a == 2)
				{
					System.out.print("# ");
				}
				else 
				{
					System.out.print(". ");
				}
			}
			System.out.println("");
		}
	}

}
