package Collection;
import java.util.*;

public class Player {
	ArrayList<Card> list = new ArrayList<Card>();
	
	public void getCard(Card card)
	{
		list.add(card);
	}
	public void showCards() {
		System.out.println(list);
	}
}
