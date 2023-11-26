package blackjack3;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int calculateScore() {
        int score = 0;
        int numAces = 0;

        for (Card card : cards) {
            score += card.getValue();
            if (card.getNumber().equals("A")) {
                numAces++;
            }
        }

        while (numAces > 0 && score > 21) {
            score -= 10;
            numAces--;
        }

        return score;
    }

    public List<Card> display() {
        for (Card card : cards) {
            System.out.println(card);
        }
        return cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}
