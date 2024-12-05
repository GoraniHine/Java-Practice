package Collection;
import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		System.out.println("벡터 요소 개수: " + v.size());
		System.out.println("벡터 현재 용량: " + v.capacity());
		
//		for(int i = 0; i < v.size(); i++)
//		{
//			int n = v.get(i);
//			System.out.println(n);
//		}
//		
//		int sum = 0;
//		
//		for(int i = 0; i < v.size(); i++)
//		{
//			int n = v.elementAt(i);
//			sum += n;
//		}
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext())
		{
			int n = it.next();
			System.out.println(n);
		}

		int sum = 0;
		
		it = v.iterator();
		
		while(it.hasNext())
		{
			int n = it.next();
			sum += n;
		}
		
		
		System.out.println("벡터 안 정수 합: " + sum);

	}

}
