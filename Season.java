package min;

import java.util.*;

public class Season {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월 (1~12)을 입력: ");
		int month = scan.nextInt();
	    
		switch(month) {
			case 3:
		    case 4:
		    case 5:
		    	System.out.println("봄");
		    	break;
		    case 6:
		    case 7:
		    case 8:
		    	System.out.println("여름");
		    	break;
		    case 9:
		    case 10:
		    case 11:
		    	System.out.println("가을");
		    	break;
		    case 12:
		    case 1:
		    case 2:
		    	System.out.println("겨울");
		    	break;
		    default:
		    	System.out.println("잘못된 입력!");
		    	
		}

	}

}
//str.equals