package blackjack2.person;

import blackjack2.cards.Card;

import java.util.ArrayList;
import java.util.List;

// 게이머
public class Gamer implements Player {
    private List<Card> cards;
    int numberGames = 0;

    public Gamer() {
        cards = new ArrayList<>();  // 뽑은 카드를 담을 곳
    }

    public void receiveCard(Card card) {
        // 뽑은 카드 소유
        this.cards.add(card);
        // 카드를 받을때 현재 소유한 카드를 확인해야함
        this.showCards();
    }

    @Override
    public void receiverCard(Card card) {

    }

    @Override
    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }
        if (numberGames >= 1) System.out.println(sb.toString());

        numberGames++;
    }

    @Override
    public List<Card> openCards() {
        // 카드 오픈
        // 현재 가지고 있는 모든 카드들을 전달하는 역할
        return this.cards;
    }
}