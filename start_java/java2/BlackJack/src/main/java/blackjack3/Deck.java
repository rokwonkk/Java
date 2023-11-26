package blackjack3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] patterns = {"하트", "다이아몬드", "클로버", "스페이드"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String pattern : patterns) {
            for (String number : numbers) {
                cards.add(new Card(pattern, number));
            }
        }

        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            System.out.println("덱에 더 이상 카드가 없습니다!");
            return null;
        }
        return cards.remove(0);
    }

}
