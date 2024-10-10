package min;

import java.util.*;

public class Quest1 {

	public static void main(String[] args) {
		while(true)
		{
			int x = 1, answer = 0;
			Scanner scan = new Scanner(System.in);
			Random r = new Random();
			int k = r.nextInt(100);
			
			while(true)
			{
				System.out.print("정답을 맞춰보세요! 대답: ");
				answer = scan.nextInt();
				if(answer == k)
				{
					System.out.println("정답입니다!!");
					break;
				}
				else if(answer > k)
				{
					System.out.println("더 낮아요");
				}
				else 
				{
					System.out.println("더 높아요");
				}
				//System.out.println(k);
			}
			
			
			System.out.println("다시할래? (yes or no) ");
			
			String n = scan.next();
			if(n.equals("no"))
			{
				break;
			}
		}

	}

}
