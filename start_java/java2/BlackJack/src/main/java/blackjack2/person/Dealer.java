package blackjack2.person;

import blackjack2.cards.Card;

import java.util.ArrayList;
import java.util.List;

// 딜러
public class Dealer implements Player {
    private List<Card> cards;

    private static final int CAN_RECEIVER_POINT = 16;

    public Dealer() {
        cards = new ArrayList<>();
    }

    public void receiveCard(Card card) {

    }

    private boolean isReceiverCard() {
        return getPointSum() <= CAN_RECEIVER_POINT;
    }

    private int getPointSum() {
        int sum = 0;
        for (Card card : cards) {
//            sum += card.getPoint();
        }
        return sum;
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

        System.out.println(sb.toString());
    }

    @Override
    public List<Card> openCards() {
        return this.cards;
    }
}
