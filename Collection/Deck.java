package Collection;
import java.util.*;

public class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();
	String[] suit = {"클로버", "다이아", "하트", "스페이드"};
	String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	public Deck()
	{
		for(int i = 0; i < suit.length; i++)
			for(int j = 0; j < number.length; j++)
				deck.add(new Card(suit[i], number[j]));
	}
	
	public void shuffle()
	{
		for(int i = 0; i < x; i++)
		{
			Collections.shuffle(deck);
		}
	}
	
	public Card deal()
	{
		return deck.remove(0);
	}
}
