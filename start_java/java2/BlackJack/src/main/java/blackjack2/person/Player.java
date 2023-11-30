package blackjack2.person;

import blackjack2.cards.Card;

import java.util.List;

public interface Player {
    void receiverCard(Card card);

    void showCards();

    List<Card> openCards();
}