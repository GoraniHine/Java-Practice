package min;

import java.util.*;

public class WhileSample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0, n = 0;
		double sum = 0.0;
		
		System.out.println("정수를 입력하고 마지막엔 0을 입력하세요: ");
		
		while((n = scan.nextInt()) != 0)
		{
			sum += n;
			count++;
		}
		System.out.print("입력한 수의 개수는 " + count + "게이며, ");
		System.out.println("평균은 " + sum / count + "입니다.");
		scan.close();
	}
}
