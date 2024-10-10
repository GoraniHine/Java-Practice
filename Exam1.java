package min;

import java.util.*;
//str.equals
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("철수가 낼 것 입력(가위, 바위, 보) : ");
		String chulsu = scan.next();
		System.out.println("영희가 낼 것 입력(가위, 바위, 보) : ");
		String young = scan.next();
			
		if(chulsu.equals(young))
		{
			System.out.println("비겼습니다.");
		}
		else if (chulsu.equals("가위"))
		{
			if(young.equals("바위"))
			{
				System.out.println("영희가 이겼습니다.");
			}
			else 
				System.out.println("철수가 이겼습니다.");
		}
		else if (chulsu.equals("바위"))
		{
			if(young.equals("보"))
			{
				System.out.println("영희가 이겼습니다.");
			}
			else 
				System.out.println("철수가 이겼습니다.");
		}
		else if (chulsu.equals("보"))
		{
			if(young.equals("가위"))
			{
				System.out.println("영희가 이겼습니다.");
			}
			else 
				System.out.println("철수가 이겼습니다.");
		}
	}
}
