package min;

import java.util.*;

public class ScannerEam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 나이, 몸무게, 키를 순서대로 입력!");
		System.out.println("너의 나이는 " + scan.nextInt() + "살이야!");
		System.out.println("너의 몸무게는 " + scan.nextDouble() + "kg이야!");
		System.out.println("너의 키는 " + scan.nextDouble() + "cm이야!");
		
		int a = 3, b = 5;
		System.out.println("두 수의 차는 " + ((a > b)?(a-b):(b-a)));
		
		char grade;
		System.out.print("점수 입력(0~100): ");
		int score = scan.nextInt();
		System.out.print("학년 입력(1~4): ");
		int year = scan.nextInt();
		
		if(score >= 60)
		{
			if(year != 4)        System.out.println("합격");
			else if(score >= 70) System.out.println("합격");
			else                 System.out.println("불합격");
				
		}
		else
			System.out.println("불합격");
	}

}
