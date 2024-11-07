package Collection;
import java.util.*;

public class Card {
	private String suit;   // 카드 무늬 (예: 하트, 다이아몬드 등)
    private String number; // 카드 숫자 (예: 2, 3, 4, ..., J, Q, K, A)

    public Card(String suit, String number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString() {
        return "(" + suit + " " + number + ")"; // 예: "2 of Hearts"
    }
}
